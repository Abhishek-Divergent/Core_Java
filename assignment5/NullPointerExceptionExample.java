package com.divergent.corejava.assignment5;

public class NullPointerExceptionExample {
	/**
	 * this method only throws Exception to caller not handle itself
	 * 
	 * @throws NullPointerException
	 */
	public void exceptionCheck()throws NullPointerException {
		String string = null;
		System.out.println(string.length());
	}

	public static void main(String[] args) {
		NullPointerExceptionExample obj = new NullPointerExceptionExample();

		try {
			obj.exceptionCheck();
		} catch (NullPointerException exception) {
			System.out.println("this is null pointer exception :" + exception);
		}
	}

}
