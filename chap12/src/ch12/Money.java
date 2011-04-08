package ch12;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Formattable;
import java.util.FormattableFlags;
import java.util.Formatter;

public class Money implements Formattable {
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
		StringBuilder sb = new StringBuilder();
		String groupFlag = "";
		if ((flags & FormattableFlags.ALTERNATE) == FormattableFlags.ALTERNATE) {
			groupFlag = ",";
		}
		if (currency.getDefaultFractionDigits() == 0) {
			String formatStr = "%" + groupFlag + "d %s";
			sb.append(String.format(formatStr, value.intValue(), currency
					.getCurrencyCode()));
		} else {
			String formatStr = "%" + groupFlag + "."
					+ currency.getDefaultFractionDigits() + "f %s";
			sb.append(String.format(formatStr, value, currency
					.getCurrencyCode()));
		}
		String formattedStr = sb.toString();

		if (width > -1) {
			if ((flags & FormattableFlags.LEFT_JUSTIFY) == FormattableFlags.LEFT_JUSTIFY) {
				formatter.format("%-" + width + "s", formattedStr);
			} else {
				formatter.format("%" + width + "s", formattedStr);
			}
		} else {
			formatter.format("%s", formattedStr);
		}
	}
}
