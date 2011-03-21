package ch12;

public class StringBuilderSample {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder(32);
		String title = "��ü ����";
		builder.append("å ������ ").append("�̸�, ");
		builder.insert(6, title);
		builder.append("������ ").append(25000).append("�� �Դϴ�.");
		System.out.println(builder.toString());
	}
}
