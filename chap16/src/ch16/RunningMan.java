package ch16;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

public class RunningMan implements Runnable {
	private static Logger logger = Logger.getLogger("RunningMan");
	private String name;
	private CountDownLatch startLatch;
	private CountDownLatch stopLatch;

	public RunningMan(String name, CountDownLatch startLatch, 
			CountDownLatch stopLatch) {
		this.name = name;
		this.startLatch = startLatch;
		this.stopLatch = stopLatch;
	}

	@Override
	public void run() {
		try {
			startLatch.await();
		} catch (InterruptedException ex) {
			logger.severe("��� ����");
			return;
		}
		logger.info(name + " ���");
		try {
			Random random = new Random(this.hashCode());
			Thread.sleep(random.nextInt(5000) + 1000);
		} catch (InterruptedException ex) {
		}
		logger.info(name + " ����");
		stopLatch.countDown();
	}

	public static void main(String[] args) {
		String[] names = {"�ڹ�", "��ī��", "�׷��"};

		CountDownLatch startSign = new CountDownLatch(1);
		CountDownLatch stopSign = new CountDownLatch(names.length);
		for (int i = 0; i < names.length ; i++) {
			RunningMan runner = new RunningMan(names[i], startSign, stopSign);
			Thread t = new Thread(runner);
			t.start();
		}
		logger.info("��� ��ȣ!");
		startSign.countDown();

		try {
			stopSign.await();
			logger.info("��� ����!");
		} catch (InterruptedException ex) {
		}
	}
}
