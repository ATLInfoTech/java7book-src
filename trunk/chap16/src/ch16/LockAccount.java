package ch16;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAccount {

	private int balance;
	private Lock lock = new ReentrantLock();

	public int getBalance() {
		return balance;
	}

	public void deposit(int val) {
		lock.lock();
		balance += val;
		lock.unlock();
	}

	public boolean withdraw(int val) {
		boolean lockAcquired = false;
		try {
			lockAcquired = lock.tryLock(3000, TimeUnit.SECONDS); // 3
		} catch (InterruptedException ex) {
			throw new RuntimeException(ex);
		}
		if (!lockAcquired) {
			// 락을 구하지 못한 경우의 처리
			throw new RuntimeException();
		}
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
