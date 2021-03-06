package com.divergent.corejava.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * In This class We are Extending Thread class to use concept of Multi-threading
 * 
 * @author JAI MAHAKAL
 *
 */
public class ThreadDemo1 extends Thread {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			myLogger.info("Thread Id:" + Thread.currentThread().getId() + "  :" + i + " \n");
		}

	}

	public static void main(String[] args) {
		myLogger.setLevel(Level.ALL);
		ThreadDemo1 th1 = new ThreadDemo1();
		ThreadDemo1 th2 = new ThreadDemo1();
		ThreadDemo1 th3 = new ThreadDemo1();

		try {
			th1.start();
			th2.start();
			th3.start();

		} catch (Exception e) {
			myLogger.info(e.getMessage());
			myLogger.warning(e.getMessage());
		}

	}

}
