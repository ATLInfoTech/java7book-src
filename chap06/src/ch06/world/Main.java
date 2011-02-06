package ch06.world;

import java.util.Calendar;
import java.util.Date;
import static java.util.Calendar.*;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.round;

public class Main {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		double x = 1, y = 2, z = 3;
		double result = sqrt(pow(x, 2) + pow(y, 2) + pow(z, 2));
		System.out.println(result);

		long rounded1 = round(10.7);
		int rounded2 = round(10.7f);
		System.out.println(rounded1 + ", " + rounded2);
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(DATE, 1);
	}
}
