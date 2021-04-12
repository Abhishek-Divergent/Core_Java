package com.divergent.corejava.assignment5;
/**
 * Requested array size exceeds VM limit
 * @author JAI MAHAKAL
 *
 */
public class OutOfMemoryErrorExample {

	public static void main(String[] args) {
		int[] i=new int[Integer.MAX_VALUE];
		
		
		
		for(int a=0;a<i.length;a++) {
			i[a]=a+1;
		}

	}

}
