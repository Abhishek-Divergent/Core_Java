package com.divergent.corejava.assignment3;

public class ConstructorChaining extends SuperClass {

	public ConstructorChaining() {
		/*
		 * By defualt class super class constructor
		 * this();
		 */
		System.out.println("this is derived class constructor");
	}

	public static void main(String[] args) {
		ConstructorChaining con = new ConstructorChaining();

	}

}

class SuperClass {

	public SuperClass() {
		System.out.println("this is superclass constructor");
	}
}
