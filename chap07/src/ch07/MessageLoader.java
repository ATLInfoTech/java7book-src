package ch07;

public class MessageLoader {

	public String load(String messageId) throws MessageNotFoundException {
		switch (messageId) {
			case "M001":
				return "잘못된 값입니다..";
			case "M002":
				return "ID와 암호가 일치하지 않습니다.";
		}
		// 메시지가 존재하지 않으면 예외 발생
		throw new MessageNotFoundException("잘못된 메시지ID:" + messageId);
	}
}
