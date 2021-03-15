package com.divergent.corejava.assignment1;

/**
 * this class will check how many times a string is occur in given string
 * 
 * @author JAI MAHAKAL
 *
 */
public class OccurrencesString {
	/**
	 * this method will accept string as string1 and substring as string2 then check
	 * how many time substring occure in string
	 */
	private void occurenceOFString(String string1, String string2) {
		String[] string3 = string1.split("\\s");
		int count = 0;

		for (String string : string3) {
			if (string2.equals(string)) {
				count = count + 1;
			}
		}

		System.out.println(count);

	}

	public static void main(String[] args) {
		OccurrencesString occurrencesString = new OccurrencesString();
		String string1 = "abhishek sahu  sahu ram sahu";
		String string2 = "sahu";
		occurrencesString.occurenceOFString(string1, string2);
	}
}
