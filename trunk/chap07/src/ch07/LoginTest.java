package ch07;

public class LoginTest {

	public static void main(String[] args) {
		LoginService loginService = new LoginService();
		try {
			loginService.login("a", "123");
		} catch (MessageNotFoundException ex) {
			System.out.println("���� �߻�: " + ex.getMessage());
		}
	}
}
