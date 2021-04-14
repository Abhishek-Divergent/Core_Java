package com.divergent.corejava.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * In This class We are Extending Thread class to use concept of Multi-threading
 * 
 * @author JAI MAHAKAL
 *
 */

public class ThreadDemo2 extends Thread {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	@Override
	public void run() {
		myLogger.info("Thread " + Thread.currentThread().getId() + " is running" + " \n");
	}

	public static void main(String[] args) {
		myLogger.setLevel(Level.ALL);
		int a = 8;
		for (int i = 0; i < a; i++) {
			ThreadDemo2 demo2 = new ThreadDemo2();
			demo2.start();
		}

	}

}
