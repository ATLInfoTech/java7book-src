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

	public boolean isValid(int code) {
		if (validTo == null) {
			return true; // ��ȿ ��¥�� ������ ������ �׻� ��ȿ��
		}
		return validTo.before(new Date());
	}

}
