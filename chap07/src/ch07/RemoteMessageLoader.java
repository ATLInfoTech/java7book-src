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
			// throws�� IOException�� ������ �� �����Ƿ�, try-catch�� ó���ؾ� ��
		}
		return super.load(messageId);
	}

	private String loadMessageFromRemoteServer(String messageId) throws IOException {
		return null;
	}
}
