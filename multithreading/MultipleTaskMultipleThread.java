package com.divergent.corejava.multithreading;

public class MultipleTaskMultipleThread {

	public static void main(String[] args) {

		Thread1 thread1 = new Thread1();
		Thread1 thread12 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.start();
		thread12.start();
		thread2.start();

}
}

class Thread1 extends Thread {
	public void run() {
		System.out.println("Task 1");
	}
}

class Thread2 extends Thread {
	public void run() {
		System.out.println("Task 2");
	}
}