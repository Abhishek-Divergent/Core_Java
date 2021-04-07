package com.divergent.corejava.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionSample1 {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.add("1");
		collection.add("2");
		collection.add("3");
		System.out.println(collection);
		
		collection.add("abhishek");
		collection.add("sahu");
		collection.add("harpalpur");
		
		System.out.println(collection);
		
		collection.add(null);
		
		System.out.println(collection);
		
		collection.add(null);
		
		System.out.println(collection);
		
		boolean b = Collections.addAll(collection, "100", "200", "300", "400", "500");
		
		System.out.println(collection);
		collection.remove("sahu");
		 
		System.out.println(collection);
		
		/**
		 * in collection interface add method does not support argument string and
		 * integer value
		 * 
		 * collection.add(4,"sahu");
		 */

	}
}
