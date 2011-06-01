package ch16;

import java.util.Date;

public class SumRunnable implements Runnable {

	private int from;
	private int to;

	public SumRunnable(int from, int to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
		System.out.printf("[%tT] %d ~ %d -> %d%n", new Date(), from, to, sum);
	}
}
