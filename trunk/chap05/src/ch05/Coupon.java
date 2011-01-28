package ch05;

import java.util.Date;

public class Coupon {

	/** ��ȿ ��¥ */
	private Date validTo;

	public Coupon() {
	}

	public Coupon(Date validTo) {
		this.validTo = validTo;
	}

	public boolean isValid() {
		if (validTo == null) {
			return true; // ��ȿ ��¥�� ������ ������ �׻� ��ȿ��
		}
		return validTo.before(new Date());
	}

	public int calculateDiscount(int price) {
		return 0;
	}
}
