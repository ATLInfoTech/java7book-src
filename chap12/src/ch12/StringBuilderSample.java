package ch12;

public class StringBuilderSample {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		String title = "��ü ����";
		builder.append("å ������ ").append(title).append("�̸�, ");
		builder.append("������ ").append(25000).append("�� �Դϴ�.");
		System.out.println(builder.toString());
	}
}
