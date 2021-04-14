package com.divergent.corejava.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * In this class here implements the runnable interface
 * 
 * @author JAI MAHAKAL
 *
 */

public class RunnableDemo1 implements Runnable {

	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			myLogger.info("Thread :" + Thread.currentThread().getId() + "  :" + i + " \n");
		}

	}

	public static void main(String[] args) {
		myLogger.setLevel(Level.ALL);
		Runnable obj = new RunnableDemo1();

		Thread th1 = new Thread(obj);
		Thread th2 = new Thread(obj);
		Thread th3 = new Thread(obj);
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
