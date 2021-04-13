package com.divergent.corejava.collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		lh.add(5);
		lh.add(1);
		lh.add(3);
		lh.add(7);
		lh.add(9);
		System.out.println(lh);
		lh.add(7);
		lh.add(12);
		lh.add(450);
		System.out.println(lh);
		
		
	}
}
