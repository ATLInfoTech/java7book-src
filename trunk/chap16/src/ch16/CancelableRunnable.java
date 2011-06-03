package ch16;

import java.util.Random;

public class CancelableRunnable implements Runnable {

	@Override
	public void run() {
		Random random = new Random();
		while( !Thread.currentThread().isInterrupted() ) {
			System.out.println(random.nextInt());
		}
		System.out.println("work canceled");
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new CancelableRunnable());
		t.start();
		
		Thread.sleep(4000);
		System.out.println("interrupt");
		t.interrupt();
	}
}
