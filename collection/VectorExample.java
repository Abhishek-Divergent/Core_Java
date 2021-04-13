package com.divergent.corejava.collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String args[]){  
		Vector<String> v=new Vector<String>();  
		System.out.println(v);
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  }
		v.add("adsfadf")  ;
		System.out.println("**************");
		ListIterator<String> itr1=v.listIterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		
		}
		
		
		

		}  

}
