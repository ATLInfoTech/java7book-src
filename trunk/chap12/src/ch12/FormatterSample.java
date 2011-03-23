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
		String title = "��ī�� ���α׷���";
		int price = 21500;
		String author = "������Ű";

		StringBuilder sb = new StringBuilder(64);
		Formatter formatter = new Formatter(sb);
		formatter.format("å ������ %s�̰� ������ %,d�Դϴ�.%n", title, price);
		formatter.format("����: %s", author);
		String result = sb.toString();
		System.out.println(result);
	}
	
	private static void formatUsageFileWriter() throws IOException {
		String title = "��ī�� ���α׷���";
		int price = 21500;
		String author = "������Ű";

		FileWriter writer = new FileWriter("c:/temp.txt");
		Formatter formatter = new Formatter(writer);
		formatter.format("å ������ %s�̰� ������ %,d�Դϴ�.%n", title, price);
		formatter.format("����: %s", author);
		writer.close();
	}

	private static void formatUsageFilePath() throws IOException {
		String title = "��ī�� ���α׷���";
		int price = 21500;
		String author = "������Ű";

		Formatter formatter = new Formatter("c:/temp2.txt");
		formatter.format("å ������ %s�̰� ������ %,d�Դϴ�.%n", title, price);
		formatter.format("����: %s", author);
		formatter.close();
	}

}
