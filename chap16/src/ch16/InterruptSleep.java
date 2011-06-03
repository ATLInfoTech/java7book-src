package ch16;

import java.util.logging.Logger;

public class InterruptSleep {
	private static Logger logger = Logger.getLogger("");
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				logger.info("t enter run method");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException ex) {
					logger.info("t interrupted.");
				}
				logger.info("t exit");
			}
		});
		logger.info("t started");
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		logger.info("interrupt t");
		t.interrupt();
	}
	
}
