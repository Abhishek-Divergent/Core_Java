package com.divergent.corejava.multithreading;

import java.util.logging.Logger;

/**
 * in this class we will join thread using join method
 * 
 * @author JAI MAHAKAL
 *
 */
public class ThreadJoin implements Runnable {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				myLogger.info("Thread  Name:" + Thread.currentThread().getName() + "  :" + i + " \n");
			} catch (InterruptedException e) {
				myLogger.info(e.getMessage());
				myLogger.warning(e.getMessage());
			}  
			
		}
	}

	public static void main(String[] args) {
		ThreadJoin obj = new ThreadJoin();
		Thread th1 = new Thread(obj);
		Thread th2 = new Thread(obj);
		Thread th3 = new Thread(obj);

		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			myLogger.info(e.getMessage());
			myLogger.warning(e.getMessage());
		}
		th2.start();
		th3.start();

	}
}
