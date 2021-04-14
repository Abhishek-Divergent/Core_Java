package com.divergent.corejava.multithreading;

import java.util.logging.Logger;

/**
 * In This class we are using interrupting concept public void interrupt()
 * public static boolean interrupted() public boolean isInterrupted()
 * 
 * @author JAI MAHAKAL
 *
 */
public class InterruptingThread implements Runnable {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	@Override
	public void run() {
		myLogger.info("Thread "+Thread.currentThread().getName() +" is interrupted  :" + Thread.interrupted());
		try {
			myLogger.info("Thread "+Thread.currentThread().getName() +" is interrupted  :" +Thread.interrupted());
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println(i);
			
			}
		} catch (InterruptedException e) {
			myLogger.info(e.getMessage());
			myLogger.warning(e.getMessage());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		InterruptingThread obj = new InterruptingThread();
		Thread th1 = new Thread(obj);
		Thread th2 = new Thread(obj);
		th1.start();
		
		th1.interrupt();
		th2.start();
	}

}
