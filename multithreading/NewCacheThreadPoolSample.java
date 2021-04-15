package com.divergent.corejava.multithreading;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/**
 * in this class NewCacheThreadPool
 * @author JAI MAHAKAL
 *
 */
public class NewCacheThreadPoolSample {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		ThreadPoolExecutor executor = (ThreadPoolExecutor) service;
		myLogger.info("Pool  Size :" + executor.getPoolSize());

		for (int i = 0; i < 5; i++) {

			executor.execute(new Runnable() {

				@Override
				public void run() {
					// myLogger.info("Pool Size :"+executor.getPoolSize());
					myLogger.info("Thread :" + Thread.currentThread().getName());

				}
			});
		}
		service.shutdown();
	}

}
