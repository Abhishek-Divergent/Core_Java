package com.divergent.corejava.assignment3;

public class MethodOverloading {
	public void operation(int a, int b) {
		System.out.println("Addition of Two Number is =" + (a + b));
	}

	public void operation(int a, int b, int c) {
		System.out.println("multiplication of three number = " +( a * b * c));
	}

	public static void main(String[] args) {
       MethodOverloading methodOverloading=new MethodOverloading();
       methodOverloading.operation(12, 120);
       methodOverloading.operation(2, 2,2);
	}

}
