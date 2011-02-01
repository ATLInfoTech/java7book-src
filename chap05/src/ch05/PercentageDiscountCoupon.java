package ch05;

import java.util.Date;

public class PercentageDiscountCoupon extends Coupon {

	private int percentage;

	public PercentageDiscountCoupon(Date validTo, int percentage) {
		super(validTo);
		this.percentage = percentage;
	}

	/**
	 * 제품 금액(price)의 일정 비율을 할인 금액으로 리턴한다.
	 */
	@Override
	public int calculateDiscount(int price) {
		return (int) ((double) price * (double) percentage / 100.0);
	}

}
