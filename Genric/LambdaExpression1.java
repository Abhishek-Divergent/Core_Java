package com.divergent.corejava.Genric;

import java.util.ArrayList;

public class LambdaExpression1 {

	public static void main(String[] args) {
     ArrayList<Integer> al=new ArrayList<>();
     al.add(12);
     al.add(11);
     al.add(16464);
     al.add(45);
//   for (int integer : al) {
//	   System.out.println(integer);   
//      }
//  
 
     al.forEach( a-> {System.out.println(a);});
     
	
	}

}
