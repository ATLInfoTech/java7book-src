package ch12;

import java.util.Currency;
import java.util.Formatter;
import java.util.Locale;

public class MoneyFormattableSample {

	public static void main(String[] args) {
		Formatter formatter = new Formatter();

		Money price1 = new Money(153000, Currency.getInstance(Locale.KOREA));
		Money price2 = new Money(104.450, Currency.getInstance(Locale.US));
		formatter.format("금액은 [%s]입니다.\n", price1);
		formatter.format("금액은 [%#s]입니다.\n", price1);
		formatter.format("금액은 [%-12s]입니다.\n", price2);
		formatter.format("금액은 [%12s]입니다.\n", price2);

		System.out.println(formatter.toString());
	}
}
