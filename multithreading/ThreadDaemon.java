package com.divergent.corejava.multithreading;

import java.util.logging.Logger;

/**
 * 
 * In This class We will set Thread as Daemon Or will Thread is Daemon or not
 * isDaemon() setDaemon(true)
 * 
 * @author JAI MAHAKAL
 *
 */
public class ThreadDaemon implements Runnable {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	@Override
	public void run() {

		if (Thread.currentThread().isDaemon()) {
			myLogger.info("Thread Name :" + Thread.currentThread().getName() + " Is Daemon :");
		} else {
			myLogger.info("Thread Name :" + Thread.currentThread().getName() + " Is  Not Daemon :");
		}

	}

	public static void main(String[] args) {
		ThreadDaemon obj = new ThreadDaemon();
		Thread th1 = new Thread(obj);
		Thread th2 = new Thread(obj);
		Thread th3 = new Thread(obj);
		// To declare any thread as Daemon it should be declare before start
		th1.setDaemon(true);
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
