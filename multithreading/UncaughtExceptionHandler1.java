package com.divergent.corejava.multithreading;

import java.lang.Thread.UncaughtExceptionHandler;

public class UncaughtExceptionHandler1 implements Runnable {
	@Override
	public void run() {
      throw new RuntimeException();
	}

	public static void main(String[] args) {
		UncaughtExceptionHandler1 obj = new UncaughtExceptionHandler1();
        
		Thread thread1=new Thread(obj);
		  thread1.setDefaultUncaughtExceptionHandler(new Thread.  
			        UncaughtExceptionHandler()   
			        {  
			            public void uncaughtException(Thread thread, Throwable e)   
			            {  
			                System.out.println("Exception caught: " + e);  
			            }  
			        });  
			        // call run() function  
			        thread1.start();  
       
		
	}

	

}
