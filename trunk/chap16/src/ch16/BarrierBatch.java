package ch16;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BarrierBatch implements Runnable {
	private static final Logger logger = Logger.getLogger("BarrierBatch");

	private CyclicBarrier barrier;
	
	public BarrierBatch(CyclicBarrier barrier) {
		this.barrier = barrier;
	}
	
	@Override
	public void run() {
		processLogFile();
		String name = Thread.currentThread().getName();
		logger.info(name + " �α����� �з� �Ϸ�");
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException ex) {
			logger.log(Level.SEVERE, "��� �� ���� �߻�", ex);
			return;
		}
		logger.info(name + " DB ���� ����");
		processDBOperation();
	}

	private Random random = new Random(this.hashCode());
	
	private void processLogFile() {
		try { Thread.sleep(random.nextInt(3000) + 500); } catch (Exception ex) {}
	}

	private void processDBOperation() {
		try { Thread.sleep(random.nextInt(3000) + 500); } catch (Exception ex) {}
	}
	
	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(3);
		
		Thread t1 = new Thread(new BarrierBatch(barrier), "t1");
		t1.start();
		
		Thread t2 = new Thread(new BarrierBatch( barrier), "t2");
		t2.start();
		
		Thread t3 = new Thread(new BarrierBatch(barrier), "t3");
		t3.start();
		
	}
	
}
