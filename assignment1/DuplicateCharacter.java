package com.divergent.corejava.assignment1;

/**
 * this class find that in given string how many character are duplicate
 * available
 * 
 * @author JAI MAHAKAL
 *
 */
public class DuplicateCharacter {

	public static void main(String[] args) {
		DuplicateCharacter character = new DuplicateCharacter();
		String str = "abhishek sahu";
		DuplicateCharacter.findDuplicate(str);

	}
/**
 * findDuplicate method will accept string to find how many duplicate character are available in string  
 * @param str
 */
	private static void findDuplicate(String str) {
		// TODO Auto-generated method stub
		String str1 = "";
		System.out.println("  " + str);

		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (temp == str.charAt(j)) {
					str = str.replace(temp, ' ');

				}
				char ch[] = str.toCharArray();
				ch[i] = temp;
				str = String.valueOf(ch);

			}
			str = str.replaceAll(" ", "");

		}
		System.out.println("  " + str);

	}

}
