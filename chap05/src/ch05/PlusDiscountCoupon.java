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
	 * ���� Ŭ������ calculateDiscount(int price) �޼��带 �������̵� ��
	 */
	@Override
	public int calculateDiscount(int price) {
		int amount = 0; // �⺻ ���� �ݾ� ����
		if (price > minimumPrice) {
			amount += plusAmount;
		}
		return amount;
	}

}
