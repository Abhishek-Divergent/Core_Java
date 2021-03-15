package com.divergent.corejava.assignment1;

/**
 * this class will remove trailing or leading space
 * 
 * @author JAI MAHAKAL
 *
 */
public class RemoveSpace {

	public static void main(String[] args) {
		RemoveSpace obj = new RemoveSpace();
		String str = new String();
		str = "Abhsihek sahu sfdf";
		obj.removeSpace(str);
	}

	/**
	 * this method will remove all space of given string
	 * 
	 * @param string
	 */
	private void removeSpace(String string) {
		string = string.replaceAll(" ", "").trim();
		System.out.println("After trim " + string + "");
	}

}
