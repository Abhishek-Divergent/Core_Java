package com.divergent.corejava.assignment1;

import java.util.Scanner;

/**
 * This Class will Check that a given string contain given substring or not
 * 
 * @author ABHISHEK SAHU
 *
 */
public class ContainsSubstring {
	/**
	 * this method will accept string and substring then method will cheak string
	 * contain given sub string or not if contain then print yes string contain
	 * substring \ else then print no given string does not contain substring
	 * 
	 * @param string
	 * @param substring
	 */
	private void containsSubstring(String string, String substring) {

		if (string.contains(substring)) {
			System.out.println("Yes String Contain sub String");
		} else {
			System.out.println("No string does not contain substring");
		}

	}


	public static void main(String[] args) {
		ContainsSubstring containsSubstringobj = new ContainsSubstring();
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scobj.nextLine();

		System.out.println("Enter a sub string to find that string contain substring or not");
		String substring = scobj.nextLine();
		containsSubstringobj.containsSubstring(string, substring);

	}

	
}
