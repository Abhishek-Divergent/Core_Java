package com.divergent.corejava.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Logger;

public class ListLinkedList1 {
	public static final Logger myLogger = Logger.getLogger("com.divergent.corejava.collection");

	public static void main(String[] args) {
	    LinkedList<String> al=new LinkedList<String>();  
		System.out.println("Initial Size of Linked list :"+al.size());
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		System.out.println("This is Linked list :" +al);
		al.add(2,"kallu");
		System.out.println("This is Linked list after add at index 2 kalllu :" +al);
		al.addFirst("rammu");
		System.out.println("This is Linked list after add first :" +al);
		al.addLast("rammu");
		System.out.println("This is Linked list after add Last :" +al);
		System.out.println(" Get First "+al.getFirst());
		System.out.println(" Get Last "+al.getLast());

		al.remove(1);
		al.add(1, "ram vati");
		
	myLogger.info("Fetch data of link list using iterator");	
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
}
