package com.divergent.corejava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

/**
 * In this we are using Executor class method newFixedThreadPool(1 ) by this
 * single thread will we execute		ExecutorService executorService = Executors.newFixedThreadPool(1);
 * 
 * @author JAI MAHAKAL
 *
 */
public class ExecutorService2 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);

	   executorService.execute(new ExecutorService2Task1());
		executorService.execute(new ExecutorService2Task2());

//		System.out.println("Task 3  Start");
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println("\nTask 3 Done");

		executorService.shutdown();
	}

}

class ExecutorService2Task1 extends Thread {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	@Override
	public void run() {
		myLogger.info("Task 1  Start");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		myLogger.info("\n\nTask 1 Done");

	}

}

class ExecutorService2Task2 extends Thread {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	@Override
	public void run() {
		myLogger.info("Task 2  Start");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		myLogger.info("\n\\nTask 2 Done");

	}

}



