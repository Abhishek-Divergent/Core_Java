package com.divergent.corejava.assignment4;

import com.sun.jdi.Method;

/**
 * In This class if You will create object of superclass using subclass then it
 * will give error compilation error There is another way ,using casting assign
 * object of super class to sub class reference
 * 
 * @author JAI MAHAKAL
 *
 */
public class DownCasting {
	public static void main(String[] args) {

		// this is upcasting
		SuperClass superobj = new Subclass();

		// this is downcasting

		// Subclass subobj = superobj;there is problem in this line automatically
		// casting is not possible
		// so we use casting technique
		Subclass subobj = (Subclass) superobj;
	}

}

class SuperClass {

}

class Subclass extends SuperClass {

}