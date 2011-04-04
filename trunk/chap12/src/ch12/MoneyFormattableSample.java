package ch12;

import java.util.Currency;
import java.util.Formatter;
import java.util.Locale;

public class MoneyFormattableSample {

	public static void main(String[] args) {
		Formatter formatter = new Formatter();

		Money price1 = new Money(1000.0, Currency.getInstance(Locale.KOREA));
		Money price2 = new Money(104.450, Currency.getInstance(Locale.US));
		formatter.format(Locale.KOREA, "�ݾ��� '[%-10s]'�Դϴ�.", price1);
		formatter.format(Locale.KOREA, "�ݾ��� '[%10.10s]'�Դϴ�.", price2);

		System.out.println(formatter.toString());
	}
}
