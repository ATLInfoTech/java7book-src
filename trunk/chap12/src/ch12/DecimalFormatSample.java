package ch12;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatSample {

	public static void main(String[] args) {
		formatSample();
		parseSample();
		formatSubpattern();
	}

	private static void formatSample() {
		DecimalFormat format = new DecimalFormat("######,###.##");
		System.out.println(format.format(1234567.8765));
		System.out.println(format.format(-1234567.8765));
		
		format = new DecimalFormat("00000,0000.00");
		System.out.println(format.format(1234567.8962));
		System.out.println(format.format(-1234567.8962));
		
		format = new DecimalFormat("0.###E00");
		System.out.println(format.format(1234567.8962));
		
		format = new DecimalFormat("##.00%");
		System.out.println(format.format(0.97345));
		
		format = new DecimalFormat("\u2030###.00");
		System.out.println(format.format(0.97345));
	}
	
	private static void parseSample() {
		DecimalFormat format = new DecimalFormat("######,###.##");
		try {
			Number num = format.parse("123,456");
			System.out.println(num.intValue());
			
			num = format.parse("123,456.78");
			System.out.println(num.doubleValue());
		} catch (ParseException e) {
			// 예외 처리
		}
	}

	private static void formatSubpattern() {
		DecimalFormat format = new DecimalFormat("#0.000;-#0.000");
		System.out.println(format.format(1.234));
		System.out.println(format.format(-1.234));
	}
}
