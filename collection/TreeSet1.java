package com.divergent.corejava.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

		TreeSet<String> al = new TreeSet<String>();
		al.add("1");
		al.add("3");
		al.add("2");
		al.add("5");
		// Traversing elements
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		al.add("1");
		al.add("4");
		//al.add(null);
		Iterator<String> itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		 System.out.println("Highest Value: "+al.pollFirst());  
         System.out.println("Lowest Value: "+al.pollLast()); 
	}

}
