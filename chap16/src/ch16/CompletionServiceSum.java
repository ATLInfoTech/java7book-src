package ch16;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceSum {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		CompletionService<Integer> completionService = 
				new ExecutorCompletionService<>(executorService);
		
		completionService.submit(new SumCallable(1, 100));
		completionService.submit(new SumCallable(101, 200));
		completionService.submit(new SumCallable(201, 300));
		completionService.submit(new SumCallable(301, 400));
		completionService.submit(new SumCallable(401, 500));
		completionService.submit(new SumCallable(501, 600));

		for (int i = 1 ; i <= 6 ; i++) {
			try {
				Future<Integer> future = completionService.take();
				Integer sum = future.get();
				System.out.println(sum);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			} catch (ExecutionException ex) {
				ex.printStackTrace();
			}
		}
		executorService.shutdown();
	}
}
