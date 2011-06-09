package ch16;

import java.util.EmptyStackException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncStack<E> {

	private Object[] values;
	private int count = 0;
	
	private Lock lock = new ReentrantLock();
	
	public SyncStack(int capacity) {
		values = new Object[capacity];
	}
	
	public boolean push(E value) {
		lock.lock();
		try {
			if (count == values.length) {
				return false;
			}
			values[count++] = value;
			return true;
		} finally {
			lock.unlock();
		}
	}
	
	public E pop() {
		lock.lock();
		try {
			if (count == 0) {
				throw new EmptyStackException();
			}
			return (E)values[--count];
		} finally {
			lock.unlock();
		}
	}
}
