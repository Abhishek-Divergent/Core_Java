package com.divergent.corejava.multithreading;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * this calss use executing multiple callable task
 * @author JAI MAHAKAL
 *
 */
public class MultipleCallableRunner1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(1);

		List<MultiCallableTask> task = List.of(new MultiCallableTask("Abhishek Sahu"),
				new MultiCallableTask("Ram Sahu"), new MultiCallableTask("mannu Sahu"));

		List<Future<String>> ft = service.invokeAll(task);
		for (Future<String> future : ft) {
			System.out.println(future.get());
		}

		service.shutdown();
	}

}

class MultiCallableTask implements Callable<String> {

	private String name;

	public MultiCallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello" + name;
	}

}
