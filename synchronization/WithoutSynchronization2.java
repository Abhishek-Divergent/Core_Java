package com.divergent.corejava.synchronization;



public class WithoutSynchronization2 extends Thread{
     static Table obj; 
     int t;
     @Override
    public void run() {
    obj.printTable(t);
     }
	public static void main(String[] args) {
		obj=new Table();
		
		WithoutSynchronization2 s1=new  WithoutSynchronization2();
		s1.t=2;
		s1.start();
		WithoutSynchronization2 s2=new  WithoutSynchronization2();
		s2.t=3;
		s2.start();
	}

}

class Table {

	void printTable(int val) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(val * i);
			 try{  
			      Thread.sleep(400);  
			     }catch(Exception e){System.out.println(e);}  
			   }  
		}

	}


