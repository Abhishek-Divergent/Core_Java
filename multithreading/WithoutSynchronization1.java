package com.divergent.corejava.multithreading;

import java.util.logging.Logger;

/**
 * in class we are not doing synchronization and accessing resource bymulti
 * thread
 * 
 * @author JAI MAHAKAL
 *
 */
public class WithoutSynchronization1 extends Thread {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");
	static BookSeat obj;
	int seat;

	@Override
	public void run() {

		myLogger.info(Thread.currentThread().getId() + "");
		obj.book(seat);
		// Thread.sleep(5000);

	}

	public static void main(String[] args) {
		obj = new BookSeat();
		WithoutSynchronization1 th1 = new WithoutSynchronization1();
		th1.seat = 7;
		th1.start();
		WithoutSynchronization1 th2 = new WithoutSynchronization1();
		th2.seat = 6;
		th2.start();

		/*
		 * WithoutSynchronization1 th3 = new WithoutSynchronization1(); th3.seat = 9;
		 * th3.start();
		 */
	}

}

class BookSeat {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	int total_Seat = 1000;

	void book(int seat) {
		try {
			if (total_Seat >= seat) {
				total_Seat = total_Seat - seat;
				Thread.sleep(1000);
				// System.out.println("Seat are booked " + " Left Seat is " + total_Seat);
				myLogger.info("Seat are  booked " + " Left Seat is " + total_Seat);
			} else {
				// System.out.println("Seat are Not Avaliable");
				// System.out.println(" Left Seat is " + total_Seat);
				myLogger.warning("Seat are Not Avaliable");
				myLogger.info(" Left Seat is " + total_Seat);
			}

			Thread.sleep(400);
		} catch (Exception e) {
			myLogger.info(e.getMessage());
		}

	}

}
