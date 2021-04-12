package com.divergent.corejava.assignment5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionExample {

	public void checkException() throws InputMismatchException {
		System.out.println("Enter integer input if u will enter other argument then it will throw exception ");
		Scanner scanner = new Scanner(System.in);
		int str = scanner.nextInt();
	}

	public static void main(String[] args) {
		InputMismatchExceptionExample example = new InputMismatchExceptionExample();

		try {
			example.checkException();
		} catch (InputMismatchException e) {
			System.out.println("this isUncheaked Exception " + e);
		}

	}

}
