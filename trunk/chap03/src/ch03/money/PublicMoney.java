package ch03.money;

public class PublicMoney {

	public int amount;
	public String currency;

	public double doubleValue() {
		return (double) amount;
	}
}