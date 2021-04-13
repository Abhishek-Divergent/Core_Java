package com.divergent.corejava.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {
	public static void main(String[] args) {
		Set<String> data = new TreeSet<String>();
		data.add("JavaTpoint");
		data.add("Set");
		data.add("Example");
		System.out.println (data.add("Set"));
		System.out.println (data.add("Aallu"));
		//System.out.println (data.add(null));// tree not allowed to store in null value		
		System.out.println(data);
	}

}
