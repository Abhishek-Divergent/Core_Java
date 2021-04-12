package com.divergent.corejava.assignment5;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int[] i = new int[] { 1, 2, 3, 4 };
			System.out.println(i[2]);
			int a = 100 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("further task");
	}

}
