package ch17.chat.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import ch17.chat.InvalidTypeException;
import ch17.chat.Message;
import ch17.chat.Message.Type;

public class Handler implements Runnable {
	private static Logger logger = Logger.getLogger(Handler.class.getName());

	private static ConcurrentMap<Handler, Boolean> handlers = new ConcurrentHashMap<Handler, Boolean>();

	private Socket socket;
	private BufferedReader reader;
	private BufferedWriter writer;
	private String clientName;

	public Handler(Socket socket) throws IOException {
		this.socket = socket;
		this.reader = new BufferedReader(new InputStreamReader(socket
				.getInputStream()));
		this.writer = new BufferedWriter(new OutputStreamWriter(socket
				.getOutputStream()));
	}

	@Override
	public void run() {
		try {
			clientName = readClientName();
			if (clientName == null) {
				return;
			}
			handlers.put(this, Boolean.TRUE);
			sendMessageToAll(Type.ENT, clientName);

			boolean exit = false;
			while (!exit) {
				Message message = readMessage();
				switch (message.getType()) {
				case EXT:
					exit = true;
					handlers.remove(this);
					sendMessageToAll(Type.EXT, clientName);
					break;
				case SND:
					sendMessageToAll(Type.SND, clientName + ":"
							+ message.getData());
					break;
				}
			}
		} catch (IOException ex) {
			logger.log(Level.WARNING, "", ex);
		} catch (InvalidTypeException e) {
			logger.log(Level.SEVERE, this + " sent invalid type value.", e);
		} finally {
			logger.info("disconnect from " + this);
			close();
		}
	}

	private void sendMessageToAll(Type type, String data) {
		for (Handler h : handlers.keySet()) {
			try {
				h.write(type, data);
			} catch (IOException ex) {
				logger.log(Level.WARNING, "fail to write to " + h, ex);
			}
		}
	}

	private String readClientName() throws IOException, InvalidTypeException {
		Message message = readMessage();
		if (message.getType() == Message.Type.ENT) {
			return message.getData();
		}
		return null;
	}

	private Message readMessage() throws IOException, InvalidTypeException {
		String line = reader.readLine();
		try {
			String typeValue = line.substring(0, 3);
			Type type = Type.valueOf(typeValue);
			String data = null;
			if (type != Type.EXT) {
				data = line.substring(4);
			}
			return new Message(type, data);
		} catch (IllegalArgumentException ex) {
			throw new InvalidTypeException(line);
		}
	}

	private void write(Message.Type type, String data) throws IOException {
		writer.append(type.name());
		writer.append(" ");
		writer.append(data);
		writer.newLine();
		writer.flush();
	}

	private void close() {
		try {
			reader.close();
		} catch (IOException e) {
		}
		try {
			writer.close();
		} catch (IOException e) {
		}
		try {
			socket.close();
		} catch (IOException e) {
		}
	}

	@Override
	public String toString() {
		return clientName + ":" + socket.getRemoteSocketAddress();
	}
}
