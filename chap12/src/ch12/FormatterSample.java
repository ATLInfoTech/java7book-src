package ch12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class FormatterSample {

	public static void main(String[] args) throws IOException {
		formatUsageStringBuilder();
		formatUsageFileWriter();
		formatUsageFilePath();
	}
	
	private static void formatUsageStringBuilder() {
		String title = "스카라 프로그래밍";
		int price = 21500;
		String author = "오더스키";

		StringBuilder sb = new StringBuilder(64);
		Formatter formatter = new Formatter(sb);
		formatter.format("책 제목은 %s이고 가격은 %,d입니다.%n", title, price);
		formatter.format("저자: %s", author);
		String result = sb.toString();
		System.out.println(result);
	}
	
	private static void formatUsageFileWriter() throws IOException {
		String title = "스카라 프로그래밍";
		int price = 21500;
		String author = "오더스키";

		FileWriter writer = new FileWriter("c:/temp.txt");
		Formatter formatter = new Formatter(writer);
		formatter.format("책 제목은 %s이고 가격은 %,d입니다.%n", title, price);
		formatter.format("저자: %s", author);
		writer.close();
	}

	private static void formatUsageFilePath() throws IOException {
		String title = "스카라 프로그래밍";
		int price = 21500;
		String author = "오더스키";

		Formatter formatter = new Formatter("c:/temp2.txt");
		formatter.format("책 제목은 %s이고 가격은 %,d입니다.%n", title, price);
		formatter.format("저자: %s", author);
		formatter.close();
	}

}
