package ch17.chat.server;

public class ServerMain {

	public static final int DEFAULT_PORT = 8931;
	
	public static void main(String[] args) {
		int port = args.length == 0 ? DEFAULT_PORT : Integer.parseInt(args[0]);
		Server server = new Server(port);
		server.start();
	}
}
