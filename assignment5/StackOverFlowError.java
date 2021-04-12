package com.divergent.corejava.assignment5;

public class StackOverFlowError {

	/**
	 * this is recursion method that call itself again and again them after throw
	 * stack overflow error
	 * 
	 * @param i
	 */
	public void recursion(int i) {
		i = i + 1;
		System.out.println(i);
		recursion(i);

	}

	public static void main(String[] args) {

		StackOverFlowError obj = null;
		int i = 0;
		obj.recursion(i);

	}

}
