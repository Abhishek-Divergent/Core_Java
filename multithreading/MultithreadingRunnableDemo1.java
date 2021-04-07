package com.divergent.corejava.multithreading;


public class MultithreadingRunnableDemo1 implements Runnable {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		MultithreadingRunnableDemo1 demo1 = new MultithreadingRunnableDemo1();

		Thread thread = new Thread(demo1);
		Thread thread1 = new Thread(demo1);
		Thread thread3 = new Thread(demo1);
		System.out.println("Name of t1:" + thread.getName());
		System.out.println("Name of t2:" + thread1.getName());
		System.out.println("id of t1:" + thread.getId());

		thread.start();

		try {
			thread.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		thread1.start();
		thread3.start();
	 thread.setName("Abhishek sahu");System.out.println("Name of t1:" + thread.getName());

	}
}
