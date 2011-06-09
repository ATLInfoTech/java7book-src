package ch16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class SafeCollectionDemo {
	public static void main(String[] args) {
		final CountDownLatch startLatch = new CountDownLatch(1);
		final CountDownLatch finishLatch = new CountDownLatch(3);
		final List<Integer> numbers = 
				Collections.synchronizedList(new ArrayList<Integer>(3));
		for (int i = 0; i < 3; i++) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						startLatch.await();
					} catch (InterruptedException ex) {
						ex.printStackTrace();
						return;
					}
					Random random = new Random(this.hashCode());
					for (int i1 = 1; i1 <= 5; i1++) {
						numbers.add(random.nextInt(10));
					}
					finishLatch.countDown();
				}
			});
			t.start();
		}
		startLatch.countDown();
		try {
			finishLatch.await();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(numbers);
	}	

}
