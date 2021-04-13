package com.divergent.corejava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IterableInterfaceIteratorWorK {
	private final static Logger myLogger=Logger.getLogger("com.divergent.corejava.collection");

	public static void main(String[] args) throws  IllegalStateException{
		myLogger.setLevel(Level.ALL);
		List<String> li = new ArrayList<>();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		li.add("e");
		Iterator<String> iterator =li.iterator();

		while(iterator.hasNext()) {
			iterator.remove();//java.lang.IllegalStateException

			String str=iterator.next();
			System.out.println(str);
		
			iterator.remove();
		}
		
		
	}

}
