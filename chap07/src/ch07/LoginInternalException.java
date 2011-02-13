package ch07;

public class LoginInternalException extends Exception {

	public LoginInternalException(String msg, Exception cause) {
		super(msg, cause);
	}
}
