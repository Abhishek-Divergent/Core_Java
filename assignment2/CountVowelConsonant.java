package com.divergent.corejava.assignment2;

/**
 * in this which count vowel and consonant in given string
 * 
 * @author JAI MAHAKAL
 *
 */
public class CountVowelConsonant {
	/**
	 * this method will accept string then match each charater of string to vowel if
	 * true then will count vowel
	 * 
	 * @param string
	 */
	private void countVowelConts(String string) {
		string = string.toLowerCase();
		int countv = 0;
		int countc = 0;
		for (int i = 0; i < string.length(); i++) {
			char temp = string.charAt(i);
			if (temp == 'a' || temp == 'i' || temp == 'o' || temp == 'u' || temp == 'e') {
				countv += 1;
			} else if (temp == ' ') {
			} else {
				countc += 1;
			}
		}
		System.out.println(" Total Constant is " + countc + "\nVowel is " + countv);
	}

	public static void main(String[] args) {
		CountVowelConsonant consonant = new CountVowelConsonant();
		String string = new String();
		string = "Abhsihek Sahu";
		consonant.countVowelConts(string);
	}

}
