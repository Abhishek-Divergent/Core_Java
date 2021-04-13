package com.divergent.corejava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IterableInterfaceIterator3 {
	private final static Logger myLogger=Logger.getLogger("com.divergent.corejava.collection");

	public static void main(String[] args) {
		myLogger.setLevel(Level.ALL);
		List<String> li = new ArrayList<>();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		li.add("e");
		Iterator<String> iterator =li.iterator();
		while(iterator.hasNext()) {
			String str=iterator.next();
			System.out.println(str);
		}
		
		
		
	}

}
