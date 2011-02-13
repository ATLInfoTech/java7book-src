package ch07;

public class LoginTest2 {

	public static void main(String[] args) {
		LoginService2 loginService = new LoginService2();
		try {
			loginService.login("a", "123");
		} catch (LoginInternalException ex) {
			ex.printStackTrace();
		}
	}
}
