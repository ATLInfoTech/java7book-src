package ch12;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalSample {

	public static void main(String[] args) {
		info();
		generalUsage();
	}

	private static void generalUsage() {
		System.out.println("사용법");
		BigDecimal op1 = new BigDecimal(1);
		BigDecimal op2 = new BigDecimal(Double.toString(0.9));
		BigDecimal result = op1.subtract(op2);
		System.out.println(result);
	}
	
	private static void info() {
		System.out.println("정보");
		BigDecimal value = new BigDecimal("0.00013547");
		System.out.println(value.unscaledValue());
		System.out.println(value.precision());
		System.out.println(value.scale());
		System.out.println("정보2");
		value = new BigDecimal("-13.547");
		System.out.println(value.unscaledValue());
		System.out.println(value.precision());
		System.out.println(value.scale());
	}

}
