package com.divergent.corejava.assignment1;

import java.util.Scanner;

/**
 * this class will store each word of given string in string array then
 * calculate length of string array
 * 
 * @author JAI MAHAKAL
 *
 */
public class StringArrayLength {
    /**
     * this method will accept string and split string then store in string array after that calculate length of string array           
     * @param string
     */
	private void findArrayLength(String string) {
		String[] sh = string.split("\\s");
		System.out.println("String Array length is"+sh.length);
	}
	
	public static void main(String[] args) {
		StringArrayLength arrayLength=new StringArrayLength();
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scobj.nextLine();
		arrayLength.findArrayLength(string);
	}

}
