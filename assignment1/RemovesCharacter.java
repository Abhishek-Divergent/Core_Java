package com.divergent.corejava.assignment1;

/**
 * this class will remove specific character from given string
 * 
 * @author JAI MAHAKAL
 *
 */
public class RemovesCharacter {

	public static void main(String[] args) {
		RemovesCharacter obj = new RemovesCharacter();
		String string = new String();
		string = "Abhsihek sahu";
		char character = 's';
		obj.removeCharacter(string, character);
	}

	/**
	 * this method remove specific character from given string will accept string or
	 * character
	 * 
	 * @param string
	 * @param character
	 */
	private void removeCharacter(String string, char character) {
		string = string.replaceAll(" ", "").toLowerCase();
		string = string.replace(character, ' ');
		string = string.replace(" ", "");
		System.out.println("Character is removed " + character);
		System.out.println("After removed" + string);

	}

}
