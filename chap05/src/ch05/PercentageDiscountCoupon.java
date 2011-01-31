package ch05;

import java.util.Date;

public class PercentageDiscountCoupon extends Coupon {

	private int percentage;

	public PercentageDiscountCoupon(Date validTo, int percentage) {
		super(validTo);
		this.percentage = percentage;
	}
	
	public int calculateDiscount(int price) {
		return (int) ((double) price * (double) percentage / 100.0);
	}

}
