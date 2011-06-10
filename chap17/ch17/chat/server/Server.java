package ch17.chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
	private static Logger logger = Logger.getLogger(Server.class.getName());

	private int port;

	public Server(int port) {
		this.port = port;
	}

	public void start() {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Fail to create ServerSocket on port "
					+ port, e);
			return;
		}
		logger.info("Server start listening on port " + port);
		while (true) {
			try {
				Socket socket = serverSocket.accept();
				logger.info("Connected from " + socket.getRemoteSocketAddress());
				Thread t = new Thread(new Handler(socket));
				t.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
