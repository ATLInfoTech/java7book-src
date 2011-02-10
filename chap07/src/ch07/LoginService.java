package ch07;

public class LoginService {

	private MessageLoader loader = new MessageLoader();

	public boolean login(String id, String password)
			throws MessageNotFoundException {
		if ("admin".equals(id) && "1234".equals(password)) {
			return true;
		}
		try {
			System.out.println(loader.load("M003")); // 예외 발생
		} catch (MessageNotFoundException ex) {
			System.out.println("웁스, 메시지 없음");
			throw ex;
		}
		return false;
	}
}
