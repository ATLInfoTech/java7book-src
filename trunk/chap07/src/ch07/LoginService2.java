package ch07;

public class LoginService2 {

	private MessageLoader loader = new MessageLoader();

	public boolean login(String id, String password)
			throws LoginInternalException {
		if ("admin".equals(id) && "1234".equals(password)) {
			return true;
		}
		try {
			System.out.println(loader.load("M003")); // ���� �߻�
		} catch (MessageNotFoundException ex) {
			throw new LoginInternalException("���� ���� �߻�", ex);
		}
		return false;
	}
}
