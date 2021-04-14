package com.divergent.corejava.multithreading;

public class SynchronizeMethod1 extends
 Thread{

	 static Table1 obj; 
     int t;
     @Override
    public void run() {
    obj.printTable(t);
     }
	public static void main(String[] args) {
		obj=new Table1();
		
		SynchronizeMethod1 s1=new SynchronizeMethod1();
		s1.t=2;
		s1.start();
		SynchronizeMethod1 s2=new  SynchronizeMethod1();
		s2.t=3;
		s2.start();
	}

}
class Table1 {

	 synchronized void printTable(int val) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(val * i);
			 try{  
			      Thread.sleep(400);  
			     }catch(Exception e){System.out.println(e);}  
			   }  
		}

	}

