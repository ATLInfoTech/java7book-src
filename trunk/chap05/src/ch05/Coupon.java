package ch05;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Coupon {

	/** 유효 날짜 */
	private Date validTo;

	public Coupon(Date validTo) {
		this.validTo = validTo;
	}

	public boolean isValid(int code) {
		if (validTo == null) {
			return true; // 유효 날짜가 없으면 쿠폰은 항상 유효함
		}
		return validTo.before(new Date());
	}

	/**
	 * 쿠폰을 통해 할인 될 금액을 리턴한다. <br/>
	 * 쿠폰은 price 금액에 따라서 할인 금액이 달라질 수 있다.
	 * 
	 * @param price
	 *            제품 금액
	 * @return 할인 될 금액
	 */
	public abstract int calculateDiscount(int price);

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return "유효기간=" + (validTo == null ? "없음" : dateFormat.format(validTo));
	}

}
