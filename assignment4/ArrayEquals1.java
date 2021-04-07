package com.divergent.corejava.assignment4;

import java.util.Arrays;

/**
 * Array Equals Method is that compare to array method belongs to Array class
 * 
 * @author JAI MAHAKAL
 *
 */
public class ArrayEquals1 {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int[] b = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("A And B array is equal or not : " + Arrays.equals(a, b));
		int[] c = new int[] { 12, 5, 4, 6, 87 };
		System.out.println("A and C arrray is equal or not : " + Arrays.equals(a, c));
	}
}
