package ch12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) throws ParseException {
		date2Calendar();
		format();
	}

	private static void date2Calendar() {
		Date oldDate = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(oldDate);
		cal.add(Calendar.DATE, -15);
		Date newDate = cal.getTime();
		System.out.println(newDate);
	}

	private static void format() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date firstDayOf2011 = dateFormat.parse("2011-01-01");
		System.out.println(firstDayOf2011);
		Date now = new Date(); // 현재 시간이 2011년 1월 31일이라면
		String nowString = dateFormat.format(now); // nowString은 "2011-01-31"
		System.out.println(nowString);
	}
}
