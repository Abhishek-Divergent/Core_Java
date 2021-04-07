package com.divergent.corejava.assignment3;

public class PassByValue {
	public static void passByValue(String str) {
		str = "world";

	}

	public static void main(String[] args) {
		String str = "hello";
		System.out.println("Before pass string " + str);
		passByValue(str);
		System.out.println("After  pass string " + str);

	}

}
