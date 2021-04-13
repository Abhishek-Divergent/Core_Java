package com.divergent.corejava.multithreading;

public class ThreadPart1 extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread Task");
		
	}
	
	
	
	public static void main(String[] args) {
	/*This is  main thread   
	 * System.out.println(Thread.currentThread().getName());
		 Thread.currentThread().setName("Abhishek sahu");
		 System.out.println(Thread.currentThread().getName());
		 System.out.println(10/0); Exception
	 * 
	 */
		ThreadPart1 part1=new ThreadPart1();
		part1.start();
		System.out.println("1="+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		
		
	}

}
