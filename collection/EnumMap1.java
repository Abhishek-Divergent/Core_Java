package com.divergent.corejava.collection;

import java.util.EnumMap;

public class EnumMap1 {
	public enum shirt {
	S, M, L, XL, XXL;
}

public static void main(String[] args) {
	EnumMap<shirt,String> m = new EnumMap<>(shirt.class);
	m.put(shirt.L,"large");
	m.put(shirt.M,"medium");
	
	System.out.println(m);
}


}
