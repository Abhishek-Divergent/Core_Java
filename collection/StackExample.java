package com.divergent.corejava.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
	
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		stack.pop();
		System.out.println(stack.contains("Amit"));
		
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
