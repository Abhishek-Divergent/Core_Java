package com.divergent.corejava.synchronization;

public class SynchronizationBlock extends Thread {

	static Table3 obj;
	int t;

	@Override
	public void run() {
		obj.printTable(t);
	}

	public static void main(String[] args) {
		obj = new Table3();

		SynchronizationBlock s1 = new SynchronizationBlock();
		s1.t = 2;
		s1.start();
		SynchronizationBlock s2 = new SynchronizationBlock();
		s2.t = 3;
		s2.start();
	}
}

class Table3 {

	void printTable(int val) {
		synchronized (this) {

			for (int i = 1; i <= 10; i++) {
				System.out.println(val * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}

	}
}
