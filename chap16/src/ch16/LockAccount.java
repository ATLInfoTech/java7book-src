package ch16;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAccount {

	private int balance;
	private Lock lock = new ReentrantLock();

	public int getBalance() {
		return balance;
	}

	public void deposit(int val) {
		balance += val;
	}

	public boolean withdraw(int val) {
		lock.lock();
		try {
			if (balance >= val) {
				balance -= val;
				return true;
			}
		} finally {
			lock.unlock();
		}
		return false;
	}
}
