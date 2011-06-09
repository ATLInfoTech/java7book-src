package ch16;

import java.util.logging.Logger;

public class BlockingStackTest {
	private static Logger logger = Logger.getLogger("BlockingStackTest");

	public static void main(String[] args) {
		final BlockingStack<Integer> stack = new BlockingStack<>(2);
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					stack.push(1); logger.info("t1 push 1");
					stack.push(2); logger.info("t1 push 2");
					stack.push(3); logger.info("t1 push 3");
					Thread.sleep(2000);
					stack.push(4); logger.info("t1 push 4");
				} catch (InterruptedException ex) {
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					stack.pop();
					stack.pop();
					int val = stack.pop(); logger.info("t2 pop " + val);
					val = stack.pop(); logger.info("t2 pop " + val);
				} catch (InterruptedException ex) {
				}
			}
		});

		t1.start();
		t2.start();
	}
}
