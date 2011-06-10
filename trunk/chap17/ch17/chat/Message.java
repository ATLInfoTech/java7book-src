package ch17.chat;

public class Message {

	public static enum Type {
		ENT, EXT, SND, ERR
	}

	private Type type;
	private String data;

	public Message(Type type, String data) {
		this.type = type;
		this.data = data;
	}

	public Type getType() {
		return type;
	}

	public String getData() {
		return data;
	}

}
