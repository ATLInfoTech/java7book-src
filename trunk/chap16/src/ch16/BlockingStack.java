package ch16;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingStack<E> {

	private Object[] values;
	private int count = 0;
	
	private Lock lock = new ReentrantLock();
	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();
	
	public BlockingStack(int capacity) {
		values = new Object[capacity];
	}
	
	public boolean push(E value) throws InterruptedException {
		lock.lock();
		try {
			while (count == values.length) {
				notFull.await();
			}
			values[count++] = value;
			notEmpty.signal();
			return true;
		} finally {
			lock.unlock();
		}
	}
	
	public E pop() throws InterruptedException {
		lock.lock();
		try {
			while (count == 0) {
				notEmpty.await();
			}
			E ret = (E)values[--count];
			notFull.signal();
			return ret;
		} finally {
			lock.unlock();
		}
	}
}
