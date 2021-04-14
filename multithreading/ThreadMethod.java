package com.divergent.corejava.multithreading;

import java.util.logging.Logger;

/**
 * 
 * In This class We are Using Thread Method getId() getName()/setName()
 * getPriority()/setPriority() getState() isAlive() CurrentThread
 * 
 * @author JAI MAHAKAL
 *
 */
public class ThreadMethod implements Runnable {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	@Override
	public void run() {
		myLogger.info("Thread :" + Thread.currentThread().getId() + " Thread Name :" + Thread.currentThread().getName()
				+ " \n");
	}

	public static void main(String[] args) {
		myLogger.info("This is  Current Thread Name :" + Thread.currentThread().getName() + "\n");
		Thread.currentThread().setName("Abhishek sahu");
		myLogger.info(" Now Current Thread After setThread Name  is :" + Thread.currentThread().getName() + "\n");

		// ***************************************************

		ThreadMethod obj = new ThreadMethod();
		Thread th1 = new Thread(obj);
		Thread th2 = new Thread(obj);
		Thread th3 = new Thread(obj);
		try {
			th1.start();
			th2.start();
			th3.start();
			myLogger.info(" Piority of Thread 1 :" + th1.getPriority());
			myLogger.info(" Piority of Thread 2 :" + th2.getPriority());
			myLogger.info(" Piority of Thread 3 :" + th3.getPriority());
//			myLogger.info("  "+th1.getName()+" : "+th1.isAlive()+" ");
//			myLogger.info("  "+th2.getName()+" : "+th2.isAlive()+" ");
//			myLogger.info("  "+th3.getName()+" : "+th3.isAlive()+" ");

		} catch (Exception e) {
			myLogger.info(e.getMessage());
			myLogger.warning(e.getMessage());
		}
		th1.getPriority();
		myLogger.info(Thread.currentThread().getName() + " " + Thread.currentThread().isAlive() + " ");
	}

}
