package com.divergent.corejava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * In this we are using Executor class  method newSingalThreadExecutor by this single thread will we execute 
 * 	ExecutorService executorService = Executors.newSingleThreadExecutor();
 * @author JAI MAHAKAL
 *
 */
public class ExecutorService1 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		executorService.execute(new task1());
		executorService.execute(new task2());

		System.out.println("Task 3  Start");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 3 Done");

		executorService.shutdown();
	}

}

class task1 extends Thread {
	@Override
	public void run() {

		System.out.println("Task 1  Start");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 1 Done");

	}

}

class task2 extends Thread {

	@Override
	public void run() {
		System.out.println("Task 2  Start");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 2 Done");
	}

}
