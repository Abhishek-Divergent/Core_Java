package com.divergent.corejava.collection;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();

		hs.add(1);
		hs.add(9);
		hs.add(7);
		hs.add(1);
		hs.add(3);
		hs.add(null);
		System.out.println(hs);
		hs.remove(1);
		System.out.println(hs);
		
		
		hs.add(100);  
		hs.add(500);  
		hs.add(200);    
        hs.addAll(hs);
        System.out.println(hs);
        System.out.println(hs.hashCode());
        
       
	}

}
