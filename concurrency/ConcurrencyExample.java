package com.divergent.corejava.concurrency;
public class ConcurrencyExample extends Thread{
  int a=1;
	public void run() {
	a=a+1;	
	}
	
	public void getValue(){
		System.out.println(a);
	}
	public static void main(String []args) {
		
		ConcurrencyExample th1= new ConcurrencyExample();
		ConcurrencyExample th2= new ConcurrencyExample();
		
	     th1.start();	
	     th2.start();	
	     
	     th1.getValue();
	     th2.getValue();
		
		
	}
	
	
	
}