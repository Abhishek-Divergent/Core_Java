package com.divergent.corejava.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class CallableRunner1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(1);

		Future<String> welcomeFuture = service.submit(new CallableTask("Abhishek Sahu"));
		System.out.println(welcomeFuture.get());
		service.shutdown();
	}

}

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello" + name;
	}

}
