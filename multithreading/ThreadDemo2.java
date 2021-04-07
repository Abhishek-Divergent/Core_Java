package com.divergent.corejava.multithreading;

public class ThreadDemo2 extends Thread {
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}

	public static void main(String[] args) {
		int a = 8;
		for (int i = 0; i < 8; i++) {
			ThreadDemo2 demo2 = new ThreadDemo2();
			demo2.start();
		}

	}

}
