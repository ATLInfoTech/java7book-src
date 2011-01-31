package ch05;

import java.util.Date;

public class PlusDiscountCoupon extends AmountDiscountCoupon {

	private int minimumPrice;
	private int plusAmount;

	public PlusDiscountCoupon(Date validTo, int amount, int minimumPrice,
			int plusAmount) {
		super(validTo, amount);
		this.minimumPrice = minimumPrice;
		this.plusAmount = plusAmount;
	}

	/**
	 * 상위 클래스의 calculateDiscount(int price) 메서드를 오버라이딩 함
	 */
	@Override
	public int calculateDiscount(int price) {
		int amount = 0; // 기본 할인 금액 구함
		if (price > minimumPrice) {
			amount += plusAmount;
		}
		return amount;
	}

}
