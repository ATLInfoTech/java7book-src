package ch17.chat.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import ch17.chat.Message;
import ch17.chat.Message.Type;

public class ChatClient {
	private String host;
	private int port;

	private Socket socket;
	private BufferedReader reader;
	private BufferedWriter writer;

	private Thread receiverThread;
	private MessageListener listener;

	public ChatClient(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public void setMessageListener(MessageListener listener) {
		this.listener = listener;
	}

	public void connect() throws IOException {
		try {
			socket = new Socket(host, port);
			reader = new BufferedReader(new InputStreamReader(socket
					.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(socket
					.getOutputStream()));
		} catch (IOException ex) {
			close();
			throw ex;
		}
	}

	public void enter(String name) throws IOException {
		write(Message.Type.ENT, name);
	}

	public void sendMessage(String message) throws IOException {
		write(Message.Type.SND, message);
	}

	public void exit() throws IOException {
		write(Message.Type.EXT, null);
	}

	private void write(Type type, String data) throws IOException {
		writer.write(type.name());
		if (data != null && data.isEmpty()) {
			writer.write(" ");
			writer.write(data);
		}
		writer.newLine();
		writer.flush();
	}

	public void close() {
		if (writer != null) {
			try {
				writer.close();
			} catch (IOException e) {
			}
		}
		if (reader != null) {
			try {
				reader.close();
			} catch (IOException e) {
			}
		}
		if (socket != null) {
			try {
				socket.close();
			} catch (IOException e) {
			}
		}
	}

}
