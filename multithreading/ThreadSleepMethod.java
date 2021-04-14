package com.divergent.corejava.multithreading;

import java.util.logging.Logger;

public class ThreadSleepMethod implements Runnable {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				myLogger.info("Thread :" + Thread.currentThread().getId() + "  :" + i + " \n");
			} catch (InterruptedException e) {
				myLogger.info(e.getMessage());
				myLogger.warning(e.getMessage());
			}

		}
	}

	public static void main(String[] args) {
		ThreadSleepMethod obj = new ThreadSleepMethod();
		Thread th1 = new Thread(obj);
		Thread th2 = new Thread(obj);
		//Thread th3 = new Thread(obj);
			th1.start();
			th2.start();
		
	}

}
