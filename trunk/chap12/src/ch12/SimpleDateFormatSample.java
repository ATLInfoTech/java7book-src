package ch12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatSample {

	public static void main(String[] args) {
		fullSample();
		yearMonthSample();
		parseSample();
	}

	private static void fullSample() {
		SimpleDateFormat format = null;
		format = new SimpleDateFormat("G yy-M-d a h:m:s EEEE zzzz");
		System.out.println(format.format(new Date()));

		format = new SimpleDateFormat("G yy-M-d a h:m:s E z", Locale.US);
		System.out.println(format.format(new Date()));

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MILLISECOND, 50);
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS XXX");
		System.out.println(format.format(cal.getTime()));
	}

	private static void yearMonthSample() {
		SimpleDateFormat format = null;
		format = new SimpleDateFormat("y yy yyy yyyy yyyy");
		System.out.println(format.format(new Date()));
		format = new SimpleDateFormat("M MM MMM MMMM");
		System.out.println(format.format(new Date()));
		format = new SimpleDateFormat("d dd");
		System.out.println(format.format(new Date()));
	}

	private static void parseSample() {
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			Date dateValue = format.parse("20060731");
			System.out.println(dateValue);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
