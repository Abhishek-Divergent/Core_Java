package com.divergent.corejava.multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class AtomicVariableSample1 {
	final static Logger LOGGER = Logger.getLogger(AtomicVariableSample.class.getName());

	public static void main(String[] args) {
		Atomic1 a = new Atomic1();
		Atomic1 b = new Atomic1();

		a.start();
		LOGGER.info(a.count + " ");
		LOGGER.info(a.id + " ");
		b.start();
		LOGGER.info(a.count + " ");
		LOGGER.info(a.id + " ");
	}
}

class Atomic1 extends Thread {
	AtomicInteger count;
	long id = 1;

	public Atomic1() {
		count = new AtomicInteger();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			id = count.incrementAndGet();
		}
	}

}