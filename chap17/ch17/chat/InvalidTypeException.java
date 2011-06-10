package ch17.chat;

public class InvalidTypeException extends Exception {

	public InvalidTypeException(String data) {
		super("Invalid Data: " + data);
	}

}
