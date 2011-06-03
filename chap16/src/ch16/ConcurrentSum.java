package ch16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentSum {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(new SumRunnable(1, 100));
		executorService.execute(new SumRunnable(101, 200));
		executorService.execute(new SumRunnable(201, 300));
		executorService.execute(new SumRunnable(301, 400));
		executorService.execute(new SumRunnable(401, 500));
		executorService.execute(new SumRunnable(501, 600));
		
		executorService.shutdown();
		try {
			executorService.awaitTermination(15, TimeUnit.SECONDS);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
