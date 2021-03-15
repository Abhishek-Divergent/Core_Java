package com.divergent.corejava.assignment1;

/**
 * PalindromeString class will cheak given string is palindrome or not
 * 
 * @author JAI MAHAKAL
 *
 */
public class PalindromeString {

	public static void main(String[] args) {
		PalindromeString obj = new PalindromeString();
		String string = "saasa";
		obj.findPallindromString(string);

	}

	/**
	 * findPallindromString Method will accept string then check string is
	 * palindrome or not
	 * 
	 * @param string
	 */
	private void findPallindromString(String string) {
		String str1 = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			str1 = str1 + string.charAt(i);
		}
		if (string.equalsIgnoreCase(str1)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
