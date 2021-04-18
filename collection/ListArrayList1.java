package com.divergent.corejava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListArrayList1 {
	public static final Logger myLogger = Logger.getLogger("com.divergent.corejava.collection");

	public static void main(String[] args) {
		myLogger.setLevel(Level.ALL);
		List<Integer> l = new ArrayList<Integer>();
		System.out.println("Intial Size of List " + l.size());
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(16);
		System.out.println("List : " + l);
		l.add(3, 15);
		System.out.println("After add index List : " + l);
		System.out.println("get element from list index 2 :" + l.get(2));
		System.out.println("set element at the specific place index 2 " + l.set(2, 200));
		System.out.println("get element from lis tindex 2 :" + l.get(2));
		System.out.println("List : " + l);
		
		myLogger.info("fetach data through  Iterator");
		Iterator<Integer> itr=l.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
