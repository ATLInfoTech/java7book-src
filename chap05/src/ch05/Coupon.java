package ch05;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Coupon {

	/** ��ȿ ��¥ */
	private Date validTo;

	public Coupon(Date validTo) {
		this.validTo = validTo;
	}

	public boolean isValid(int code) {
		if (validTo == null) {
			return true; // ��ȿ ��¥�� ������ ������ �׻� ��ȿ��
		}
		return validTo.before(new Date());
	}

	/**
	 * ������ ���� ���� �� �ݾ��� �����Ѵ�. <br/>
	 * ������ price �ݾ׿� ���� ���� �ݾ��� �޶��� �� �ִ�.
	 * 
	 * @param price
	 *            ��ǰ �ݾ�
	 * @return ���� �� �ݾ�
	 */
	public abstract int calculateDiscount(int price);

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return "��ȿ�Ⱓ=" + (validTo == null ? "����" : dateFormat.format(validTo));
	}

}
