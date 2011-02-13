package ch07;

public class LoginService2 {

	private MessageLoader loader = new MessageLoader();

	public boolean login(String id, String password)
			throws LoginInternalException {
		if ("admin".equals(id) && "1234".equals(password)) {
			return true;
		}
		try {
			System.out.println(loader.load("M003")); // 예외 발생
		} catch (MessageNotFoundException ex) {
			throw new LoginInternalException("내부 에러 발생", ex);
		}
		return false;
	}
}
