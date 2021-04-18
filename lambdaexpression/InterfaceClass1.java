package com.divergent.corejava.lambdaexpression;

public class InterfaceClass1 implements Interface1{
	private int a=12,b=12;
	/**
	 * this method will accept interger value to sum two digit
	 * 
	 * 
	 * @param x 
	 * @param y
	 */
	public void sum(int x, int y) {
	   	
	 System.out.println("Sum is of two number="+(x+y));
	}
	public void mult() {
	System.out.println("Multiple is "+(a*b));	
	}
	
	public static void main(String[] args) {
	
	 Interface1 obj= new InterfaceClass1();
	 obj.sum(12, 45);
	 obj.mult();
	}
	
	
}