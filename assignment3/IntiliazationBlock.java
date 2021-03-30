package com.divergent.corejava.assignment3;

public class IntiliazationBlock {
	private int a;

	{
		System.out.println("this  is instance block");
		a = 10;
	}

	public IntiliazationBlock() {
       System.out.println(" a value has intilize before consructor call   "+a);
	}

	public static void main(String[] args) {
		System.out.println("this is main method ");
		IntiliazationBlock block = new IntiliazationBlock();
     
	}
}
