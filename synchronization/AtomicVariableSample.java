package com.divergent.corejava.synchronization;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class AtomicVariableSample {
	final static Logger LOGGER = Logger.getLogger(AtomicVariableSample.class.getName());

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread(c, "First");
		Thread t2 = new Thread(c, "Second");
		Thread t3 = new Thread(c, "Third");
		Thread t4 = new Thread(c, "Fourth");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();

		LOGGER.info("Counter is " + c.count);
	}
}

class Counter extends Thread {
	AtomicInteger count;

	public Counter() {
		count = new AtomicInteger();

	}

	public void run() {
		  int max = 1_000_00_000;
		for (int i = 0; i < max; i++) {
			this.count.addAndGet(i);
		}
	}
}
