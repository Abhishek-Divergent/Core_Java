package com.divergent.corejava.multithreading;

public class Interrupt extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is interrupted =" + Thread.interrupted());
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println(i);
				System.out.println("Thread is interrupted :" + isInterrupted());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Interrupt interrupt = new Interrupt();
		interrupt.start();
		interrupt.interrupt();

	}

}
