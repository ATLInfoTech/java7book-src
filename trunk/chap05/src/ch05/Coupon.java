package ch05;

import java.util.Date;

public class Coupon {

	/** 유효 날짜 */
	private Date validTo;

	public Coupon() {
	}

	public Coupon(Date validTo) {
		this.validTo = validTo;
	}

	public boolean isValid() {
		if (validTo == null) {
			return true; // 유효 날짜가 없으면 쿠폰은 항상 유효함
		}
		return validTo.before(new Date());
	}

	public int calculateDiscount(int price) {
		return 0;
	}
}
