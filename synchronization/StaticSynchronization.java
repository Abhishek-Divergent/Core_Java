package com.divergent.corejava.synchronization;

import java.util.logging.Logger;

public class StaticSynchronization {

	public static void main(String[] args) {
		BookSeat1 obj = new BookSeat1();

		MyThread1 th1 = new MyThread1(obj, 6);
		th1.start();

		MyThread2 th2 = new MyThread2(obj, 5);
		th2.start();
		
		BookSeat1 obj1 = new BookSeat1();

		MyThread1 th3 = new MyThread1(obj1, 9);
		th3.start();

		MyThread2 th4 = new MyThread2(obj1, 10);
		th4.start();
	}

}

class MyThread1 extends Thread {
	BookSeat1 obj;
	int seat;

	public MyThread1(BookSeat1 obj, int seat) {
		this.obj = obj;
		this.seat = seat;
	}

	@Override
	public void run() {
		obj.book(seat);
	}

}

class MyThread2 extends Thread {
	BookSeat1 obj;
	int seat;

	public MyThread2(BookSeat1 obj, int seat) {
		this.obj = obj;
		this.seat = seat;
	}

	@Override
	public void run() {
		obj.book(seat);
	}

}

class BookSeat1 {
	private static final Logger myLogger = Logger.getLogger("com.divergent.corejava.multithreading");

	private static int total_Seat = 10;

	static synchronized void book(int seat) {
		
			if (total_Seat >= seat) {
				total_Seat = total_Seat - seat;
				myLogger.info("Thread :" + Thread.currentThread().getId()+" " +seat +" Seat are  booked " + " Left Seat is "
						+ total_Seat);
			} else {
				myLogger.warning(seat+"Seat"
						+ "Not Booked  left "+ total_Seat+" ");
			
			//	myLogger.info(" Left Seat is " + total_Seat);
			}
	
	}

}
