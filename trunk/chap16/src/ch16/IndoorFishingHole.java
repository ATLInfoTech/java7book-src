package ch16;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class IndoorFishingHole {

	private Semaphore semaphore = new Semaphore(3);
	
	public void enter(Angler angler) {
		try {
			semaphore.acquire();
		} catch (InterruptedException ex) {
			return;
		}
		try {
			angler.fishing(this);
		} finally {
			semaphore.release();
		}
	}
	
	public static class Angler {
		private static int count = 0;
		private int num = ++count;
		
		private void fishing(IndoorFishingHole fishingHole) {
			System.out.println(num + " ≥¨Ω√≤€ ≥¨Ω√ Ω√¿€");
			Random random = new Random();
			try {
				Thread.sleep(random.nextInt(5000) + 5000);
			} catch (InterruptedException ex) {
			}
			System.out.println(num + " ≥¨Ω√≤€ ≥¨Ω√ ¡æ∑·");
		}
	}
	
	public static void main(String[] args) {
		final IndoorFishingHole fishingHole = new IndoorFishingHole();
		
		for (int i = 0 ; i < 6 ; i++) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					Angler angler = new Angler();
					fishingHole.enter(angler);
				}
			});
			t.start();
		}
	}
}
