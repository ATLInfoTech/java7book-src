package ch07;

public class LoginService {

	private MessageLoader loader = new MessageLoader();

	public boolean login(String id, String password)
			throws MessageNotFoundException {
		if ("admin".equals(id) && "1234".equals(password)) {
			return true;
		}
		try {
			System.out.println(loader.load("M003")); // ���� �߻�
		} catch (MessageNotFoundException ex) {
			System.out.println("��, �޽��� ����");
			throw ex;
		}
		return false;
	}
}
