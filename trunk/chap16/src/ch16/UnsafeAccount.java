package ch16;

public class UnsafeAccount {

	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int val) {
		balance += val;
	}
	
	public boolean withdraw(int val) {
		if (balance >= val) {
			balance -= val;
			return true;
		}
		return false;
	}
}
