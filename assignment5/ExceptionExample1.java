package com.divergent.corejava.assignment5;

public class ExceptionExample1 {

	public void exceptionOccur() {
		System.out.println("------- This Method will throw arithmetic Exception  ------\n\n ");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println(100 / 0);// this line will throw Exception,these exception are called arithmetic
									// exception
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
	}

	public void exceptionHandle() {

		System.out.println("\n\n------ This Method will  handle arithmetic Exception using try and catch block  ------\n\n ");

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		try {
			System.out.println(100 / 0);// this line will throw Exception,these exception are called arithmetic
		} catch (ArithmeticException e) {
			System.out.println(e);

		} // exception
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");

	}

	public static void main(String[] args) {
		ExceptionExample1 exception = new ExceptionExample1();
		exception.exceptionHandle();
		exception.exceptionOccur();
	}

}
