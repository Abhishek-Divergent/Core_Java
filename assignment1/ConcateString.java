package com.divergent.corejava.assignment1;

/**
 * 
 * @author ABHSIHEK SAHU
 * @version 14 JDK 
 *  This class will concatenate string
 *
 */
public class ConcateString {
	/**
	 *  this method will concate string and according to given number of time
	 * @param string to concatenate
	 * @param time   define that how many time string concatenate
	 *              
	 */
	private void concatinateString(String string, int time) {

		for (int i = 0; i < time / 2; i++) {
			string = string + " " + string;
		}
		System.out.println(string);

	}

	public static void main(String[] args) {
		ConcateString concateString = new ConcateString();
		String str = new String();
		str = "Abhsihek sahu";
		str = str.replace(" ", "");
		int time = 4;
		concateString.concatinateString(str, time);
	}

	

}
