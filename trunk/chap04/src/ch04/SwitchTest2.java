package ch04;

public class SwitchTest2 {

	public static void main(String[] args) {
		switch (args[0]) {
		case "h":
			System.out.println("���� ���");
			break;
		case "all":
			System.out.println("��ü ��� ���");
			break;
		default:
			System.out.println("�߸��� �Է�");
		}
	}
}
