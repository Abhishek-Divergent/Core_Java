package com.divergent.corejava.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	
	public static void main(String args[]){  
		   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(100,"Amit");    
		      map.put(102,"Ravi");    
		      map.put(101,"Vijay");    
		      map.put(103,"Rahul");    
		        
		      for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }    
		
              map.remove(101)	;
              System.out.println("After Remove");
              for(Map.Entry m:map.entrySet()){    
   		       System.out.println(m.getKey()+" "+m.getValue());    
   		      }  
	
	}  

}
