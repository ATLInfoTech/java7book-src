package ch07;

public class NoExMessageLoader extends RemoteMessageLoader {

	@Override
	public String load(String messageId) {
		return "";
	}
	
}
