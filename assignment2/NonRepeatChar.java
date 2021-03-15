package com.divergent.corejava.assignment2;

/**
 * in this class we will  find first non repeated character of given string
 * 
 * @author JAI MAHAKAL
 *
 */
public class NonRepeatChar {
	/**
	 *  method will take string then find first non repeated character
	 * @param args
	 */
	private void nonRepeat(String str1) {
		String str2 = "";
		for (int i = 0; i < str1.length(); i++) {
			char temp = str1.charAt(i);
			for (int j = 1; j < str1.length(); j++) {
				if (i == j) {
					continue;
				}
				if (temp == str1.charAt(j)) {
					str1 = str1.replaceAll("" + temp, "");
				}
			}
			str2 += temp;
		}
		System.out.println(str1.charAt(0));
	}

	public static void main(String[] args) {
		NonRepeatChar obj = new NonRepeatChar();
		String string = new String();
		string = "sashu";
		obj.nonRepeat(string);

	}

}
