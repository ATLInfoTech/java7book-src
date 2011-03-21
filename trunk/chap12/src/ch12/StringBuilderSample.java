package ch12;

public class StringBuilderSample {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder(32);
		String title = "객체 지향";
		builder.append("책 제목은 ").append("이며, ");
		builder.insert(6, title);
		builder.append("가격은 ").append(25000).append("원 입니다.");
		System.out.println(builder.toString());
	}
}
