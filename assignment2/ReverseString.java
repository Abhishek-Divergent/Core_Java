package com.divergent.corejava.assignment2;

/**
 * class will reverse given string
 */

public class ReverseString {

	public static void main(String[] args) {
		ReverseString reverse_String = new ReverseString();
		String string = new String();
		string = " this is abhishek";
		reverse_String.reverseString(string);
	}

	/**
	 * method will reverse string
	 * 
	 * @param string
	 */
	private void reverseString(String string) {
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
	}

}
