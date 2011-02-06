package ch05;

import java.util.Calendar;
import java.util.Date;

public class ObjectToStringMain {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2012, 7, 31, 23, 59, 59);
		Date validTo = calendar.getTime();
		int amount = 10000;
		AmountDiscountCoupon coupon = new AmountDiscountCoupon(validTo, amount); 
		System.out.println("ÄíÆù ¼³¸í: " + coupon);
	}
}
