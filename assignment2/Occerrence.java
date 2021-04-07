package com.divergent.corejava.assignment2;

import java.util.HashSet;
import java.util.Set;

public class Occerrence {

	private void Method(String str) {
		str = str.replaceAll(" ", "").toLowerCase();

		char ch[] = str.toCharArray();
		Set<Character> ch1 = new HashSet<>();

		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {

			}
		}

	}

	public static void main(String[] args) {
		Occerrence obj = new Occerrence();
		String str = "Abhishek sahu";
		obj.Method(str);
	}

}