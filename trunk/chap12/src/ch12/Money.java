package ch12;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Formattable;
import java.util.FormattableFlags;
import java.util.Formatter;
import java.util.Locale;

public class Money { // implements Formattable {
	private BigDecimal value;
	private Currency currency;

	public Money(BigDecimal value, Currency currency) {
		this.value = value;
		this.currency = currency;
	}

	public Money(double value, Currency currency) {
		this.value = new BigDecimal(value);
		this.currency = currency;
	}

	@Override
	public String toString() {
		return value.toString() + currency.getSymbol();
	}

	public void formatTo(Formatter formatter, int flags, int width,
			int precision) {
		StringBuilder builder = new StringBuilder();
		
		Locale locale = formatter.locale();
		formatter.format("°á°ú");
	}
}
