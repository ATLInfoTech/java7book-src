package ch12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class FormatterSample {

	public static void main(String[] args) {
		formatUsageStringBuilder();
		try {
			formatUsageFileWriter();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		try {
			formatUsageFilePath();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		formatArgIndex();
		formatGeneralConversion();
		formatNumberConversion();
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

		FileWriter writer = new FileWriter("c:\\temp.txt");
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

	private static void formatArgIndex() {
		Formatter formatter = new Formatter();
		formatter.format("%2$s %s %3$s %s", "서울", "대전", "대구", "부산");
		System.out.println(formatter.toString());
		
		formatter = new Formatter();
		formatter.format("%2$s %<s %s %<s %s", "서울", "대전", "대구");
		System.out.println(formatter.toString());
	}
	
	private static void formatGeneralConversion() {
		Formatter formatter = new Formatter();
		formatter.format("[%b] [%-8B] [%8b] [%b]\n", "true", false, "가나다", null);
		formatter.format("%h %<H %h\n", new Object(), 2);
		formatter.format("[%6s], [%<-6s], [%<3s]\n", "자바개발");
		formatter.format("%s %<S %s\n", "자바Java", null);
		formatter.format("%c %<C %c %<C\n", 'j', 99);
		System.out.println(formatter.toString());
	}
	
	private static void formatNumberConversion() {
		Formatter formatter = new Formatter();
		formatter.format("%d %d %o %x \n", 1, 10L, 20, 28);
		formatter.format("%f %f \n", 1.2, 31.1234567);
		formatter.format("%e %E %e \n", 3141.592, 1234567890.123, 0.123456789);
		formatter.format("%g %G \n", 3141.592, 1234567890.123);
		
		formatter.format("%.8f %.9f \n", 1.2, 31.1234567);
		formatter.format("%.5e %.3E %.8e \n", 3141.592, 1234567890.123, 0.123456789);
		formatter.format("%.4g %.10G \n", 3141.592, 1234567890.123);
		
		
		
		System.out.println(formatter.toString());
	}
}
