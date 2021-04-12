package com.divergent.corejava.assignment5;

public class ArrayIndexOutOfBoundsExceptionExample {
	public void checkException()throws ArrayIndexOutOfBoundsException, ArithmeticException {
		int[] i = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(i[5]);
		int b=100/0;

	}

	public static void main(String[] args) {
		ArrayIndexOutOfBoundsExceptionExample boundsException = new ArrayIndexOutOfBoundsExceptionExample();

		try {
			boundsException.checkException();
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("this is  array index out of bound Exception :" + exception);
		}
		catch (ArithmeticException exception) {
			System.out.println("\n :" + exception);
		}

	}

}
