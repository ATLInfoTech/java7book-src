package ch16;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	private AtomicInteger  value = new AtomicInteger();
	
	public int get() {
		return value.get();
	}
	
	public int increase() {
		return value.incrementAndGet();
	}
}
