package com.divergent.corejava.collection;

import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeExample{

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
	
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		
	
		for (String str : deque) {  
		System.out.println(str);  
		}  
		deque.removeFirst();
		for (String str : deque) {  
			System.out.println(str);  
			} 
		deque.removeLast();
		for (String str : deque) {  
			System.out.println(str);  
			}
	}

}
