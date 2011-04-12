package ch12;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalSample {

	public static void main(String[] args) {
		generalUsage();
		setScale();
		round();
		valueOf();
		opAndScale();
		divideAndRouding();
	}

	private static void valueOf() {
		System.out.println("-- valueOf");
		BigDecimal zeronine = BigDecimal.valueOf(0.9);
		System.out.println(zeronine);
	}

	private static void generalUsage() {
		BigDecimal op1 = new BigDecimal(1);
		BigDecimal op2 = new BigDecimal(Double.toString(0.9));
		BigDecimal result = op1.subtract(op2);
		System.out.println(result);
	}

	private static void setScale() {
		BigDecimal val = BigDecimal.valueOf(1.23);
		BigDecimal newval = val.setScale(4);
		System.out.println(newval.unscaledValue() + ", " + newval.scale());

		BigDecimal newval2 = val.setScale(1, RoundingMode.HALF_UP);
		System.out.println(newval2.unscaledValue() + ", " + newval2.scale());
		System.out.println(newval2);
	}

	private static void round() {
		System.out.println("-- round");
		BigDecimal val1 = BigDecimal.valueOf(1.23);
		BigDecimal val2 = BigDecimal.valueOf(1.26);

		System.out.println(val1.setScale(1, RoundingMode.HALF_EVEN));
		System.out.println(val2.setScale(1, RoundingMode.HALF_EVEN));
		System.out.println(val1.setScale(1, RoundingMode.HALF_UP));
		System.out.println(val2.setScale(1, RoundingMode.HALF_UP));
		System.out.println(val1.setScale(1, RoundingMode.UP));
		System.out.println(val2.setScale(1, RoundingMode.UP));
	}

	private static void opAndScale() {
		BigDecimal op1 = new BigDecimal("1.29"); // scale 2
		System.out.println(op1.scale());
		BigDecimal op2 = new BigDecimal("34"); // scale 0
		System.out.println(op2.scale());
		BigDecimal ret = op1.add(op2);
		System.out.println(ret.scale());
		System.out.println(ret.precision());
		System.out.println(ret.unscaledValue());
		System.out.println(ret.floatValue());
	}

	private static void divideAndRouding() {
		BigDecimal op1 = new BigDecimal(10);
		BigDecimal op2 = new BigDecimal(3);
		System.out.println(op1.divide(op2, RoundingMode.HALF_UP));
		System.out.println(op1.divide(op2, 5, RoundingMode.HALF_UP));

		BigDecimal ret = op1.divide(op2, new MathContext(5,
				RoundingMode.HALF_UP));
		System.out.println(ret.scale());
	}

}
