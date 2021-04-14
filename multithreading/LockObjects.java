package com.divergent.corejava.multithreading;

import java.util.concurrent.locks.ReentrantLock;
/**
 * This is Lock Object Class  we will here  use ReentrantLock Class then will lock object and unlock 
 * @author JAI MAHAKAL
 *
 */
public class LockObjects extends Thread {
	static ReentrantLock robj;
	static int count = 0;

	public static void countIncrement() {
		robj.lock();

		try {
			count++;
		} finally {
			robj.unlock();
		}

	}

	public static void main(String[] args) throws InterruptedException {

		robj = new ReentrantLock();
		Thread thread1 = new Thread(() -> {
			for (int i = 1; i <= 100000; i++) {
				countIncrement();
			}
		});

		thread1.start();
		Thread.sleep(1);
		System.out.println(count);
		Thread thread2 = new Thread(() -> {
			for (int i = 1; i <= 100000; i++) {
				countIncrement();
			}
		});
		thread2.start();
		Thread.sleep(1);
		System.out.println(count);

	}
}
