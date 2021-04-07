package com.divergent.corejava.multithreading;

public class DaemonThread1 extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("this is thread is daemon");
		} else {
			System.out.println("this thread is not daemon");
		}

	}

	public static void main(String[] args) {
		DaemonThread1 th1 = new DaemonThread1();
		DaemonThread1 th2 = new DaemonThread1();
		DaemonThread1 th3 = new DaemonThread1();
		// Before start daemon thread should set daemon
		th1.setDaemon(true);
		th1.start();
		th2.start();
		th3.start();
	}

}
