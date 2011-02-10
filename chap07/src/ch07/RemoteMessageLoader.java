package ch07;

import java.io.IOException;

public class RemoteMessageLoader extends MessageLoader {

	@Override
	public String load(String messageId) throws MessageNotFoundException {
		try {
			String msg = loadMessageFromRemoteServer(messageId);
			if (msg != null) {
				return msg;
			}
		} catch(IOException e) {
			// throws에 IOException을 지정할 수 없으므로, try-catch로 처리해야 함
		}
		return super.load(messageId);
	}

	private String loadMessageFromRemoteServer(String messageId) throws IOException {
		return null;
	}
}
