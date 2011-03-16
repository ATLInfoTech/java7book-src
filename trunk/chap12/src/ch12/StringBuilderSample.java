package ch12;

public class StringBuilderSample {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		String title = "객체 지향";
		builder.append("책 제목은 ").append(title).append("이며, ");
		builder.append("가격은 ").append(25000).append("원 입니다.");
		System.out.println(builder.toString());
	}
}
