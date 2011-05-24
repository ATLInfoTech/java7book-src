package ch16;

public class SyncAccount {

	private int balance;

	public synchronized int getBalance() {
		return balance;
	}

	public synchronized void deposit(int val) {
		balance += val;
	}

	public synchronized boolean withdraw(int val) {
		if (balance >= val) {
			balance -= val;
			return true;
		}
		return false;
	}
}
