package ch05;

import java.util.Date;

public class AmountDiscountCoupon extends Coupon {

	private int amount;

	public AmountDiscountCoupon(Date validTo, int amount) {
		super(validTo);
		this.amount = amount;
	}

	@Override
	public int calculateDiscount(int price) {
		return amount;
	}

	@Override
	public String toString() {
		return "AmountDiscountCoupon:" + super.toString() + ", 할인금액=" + amount;
	}

}
