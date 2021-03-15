package com.divergent.corejava.assignment2;

/**
 * this class will show how many duplicate character are available in a given
 * string
 * 
 * @author JAI MAHAKAL
 *
 */
public class CountDuplicateChar {
	/**
	 * method will accept string then will count duplicate character in given string
	 * 
	 * @param str
	 */
	public void countDuplicateCharacter(String string) {
		int count = 0;
		String val = "";
		for (int i = 0; i < string.length(); i++) {
			char temp = string.charAt(i);
			for (int j = i + 1; j < string.length(); j++) {
				if (temp == string.charAt(j)) {
					val = val + temp;
					string = string.replace(temp, '\0');
					count = count + 1;
					break;
				}
			}

		}
		System.out.println("Duplicate character are =" + val);
		System.out.println("Duplicate count is=" + count);
	}

	public static void main(String[] args) {
		CountDuplicateChar obj = new CountDuplicateChar();
		String string = new String();
		string = "sahusahusahu";
		obj.countDuplicateCharacter(string);
	}

}
