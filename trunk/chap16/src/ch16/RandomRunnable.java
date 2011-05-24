package ch16;

import java.util.Random;

public class RandomRunnable implements Runnable {

	private String name;
	
	public RandomRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		Random random = new Random();
		for (int i = 1 ; i <= 3 ; i++) {
			System.out.println(name+" : " + random.nextInt(100));
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				// antl
			}
		}
	}
	
}
