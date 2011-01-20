package ch03.bank;

import ch03.money.PublicMoney;

public class AccountPM {

	private PublicMoney balance;
	
	public PublicMoney deposit(PublicMoney money) {
		balance.amount += money.amount;
		return balance;
	}
	
	public PublicMoney withdraw(PublicMoney money) {
		balance.amount -= money.amount;
		return balance;
	}
}