package com.divergent.corejava.assignment2;

/**
 * 
 * this class will check permutation of string
 */
public class PermutationOfString {

	/**
	 * in this method we will check combination of string
	 * 
	 * @param string
	 */

	private void permutationOfString(String string) {
		for (int i = 0; i < string.length() - 1; i++) {
			for (int j = 1; j < string.length(); j++) {
				System.out.println(swaping(string, i, j));

			}

		}

	}

	/**
	 * this method will swap character then will return swap string
	 * 
	 * @param str
	 * @param i
	 * @param j
	 * @return
	 */
	private String swaping(String str, int i, int j) {
		char ch[] = str.toCharArray();
		char temp;
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		str = String.valueOf(ch);
		return str;
	}

	public static void main(String[] args) {
		PermutationOfString permutationofstring = new PermutationOfString();
		String string = new String();
		string = "abc";
		permutationofstring.permutationOfString(string);

	}

}
