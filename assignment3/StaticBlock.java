package com.divergent.corejava.assignment3;

public class StaticBlock {
	private static int a;

	static {
		a = 20;
		System.out.println("this is static block"+a);

	}

	public static void main(String[] args) {

	}
}
