package com.divergent.corejava.assignment2;

/**
 * string contain digit class will check that string contain only digit or not
 * 
 * @author JAI MAHAKAL
 *
 */
public class StringContainDigit {

	public static void main(String[] args) {
		String string = new String();
		StringContainDigit obj = new StringContainDigit();
		string = "12345a";
		obj.containDigit(string);

	}

	/**
	 * this method will check that given string contain digit only or not if string
	 * will contain single character then will be print character contain
	 * 
	 * @param str
	 */
	private void containDigit(String str) {
		int countv = 0;
		int countc = 0;
		boolean bol = false;

		for (int i = 0; i < 1; i++) {
			char temp = str.charAt(i);

			if (temp >= 'a' && temp <= 'z') {

				for (int j = i + 1; j < str.length(); j++) {
					char temp1 = str.charAt(j);
					if (temp1 >= 30 || temp1 <= 39) {
						break;
					}
					System.out.println("Character contain");
				}
			} else {
				for (int j = i + 1; j < str.length(); j++) {
					char temp2 = str.charAt(j);
					if (temp2 >= 'a' && temp2 <= 'z') {
						System.out.println("Character contain");
						bol = true;
						break;
					}
				}
				if (bol == true) {
					break;
				} else
					System.out.println("only digit");
			}
		}

	}

}
