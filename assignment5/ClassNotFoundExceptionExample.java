package com.divergent.corejava.assignment5;
/**
 * in this we will check ClassNotFoundException
 * @author JAI MAHAKAL
 *
 */
public class ClassNotFoundExceptionExample {

	public static void main(String[] args) throws ClassNotFoundException {
     	Class.forName("b");
	}

}
