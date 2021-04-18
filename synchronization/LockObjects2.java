package com.divergent.corejava.synchronization;

import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class LockObjects2 implements Runnable {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");
			
	 static ReentrantLock robj;
	@Override
	public void run() {
		try {
			robj.lock();
			Thread.sleep(1000);
			for (int i = 0; i < 10; i++) {
				myLogger.info("Thread :" + Thread.currentThread().getId() + "  :" + i + " \n");
			}
		} catch (InterruptedException e) {
			myLogger.info(e.getMessage());
			myLogger.warning(e.getMessage());
		}
		
		finally {
			robj.unlock();
		}
		
	}

	public static void main(String[] args)  {

		robj=new ReentrantLock();

		LockObjects2 lobj = new LockObjects2();
		Thread thread1 = new Thread(lobj);

		Thread thread3 = new Thread(lobj);
	
		Thread thread2 = new Thread(lobj);
		
		thread3.start();
		thread1.start();
		thread2.start();
	
	}

}

