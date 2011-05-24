package ch16;

public class SyncBlockAccount {

	private int balance;
	private Object lock = new Object();

	public int getBalance() {
		return balance;
	}

	public void deposit(int val) {
		synchronized (lock) {
			balance += val;
		}
	}

	public boolean withdraw(int val) {
		synchronized (lock) {
			if (balance >= val) {
				balance -= val;
				return true;
			}
		}
		return false;
	}
}
