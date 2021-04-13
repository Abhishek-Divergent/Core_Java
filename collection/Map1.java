package com.divergent.corejava.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map1 {
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Abhsiehk", "harpalpur");
		Employee e2 = new Employee("kalluas", "harpalpur");
		Employee e3 = new Employee("rammu", "harpalpur");

		Map<Integer ,Employee> map = new HashMap<>();
		/*
		 * map.put("1", e1.name); map.put("2", e1.city);
		 * 
		 * System.out.println(map.keySet() + " " + map.values());
		 * 
		 * map.put("1", "sahu"); System.out.println(map.keySet() + " " + map.values());
		 * System.out.println(map.get("1"));
		 */
	     map.put(1,e1);
	     
	     map.put(2,e2);
	     
	     map.put(3,e3);
	     
	      for (Map.Entry<Integer, Employee> m : map.entrySet()) {
	    	  
	    	  System.out.println(m.getKey()+"   "+m.getValue().name+"  "+m.getValue().city);
			
		}
	      System.out.println(map.get(1).toString());
	      System.out.println(map.get(2).toString());
	      System.out.println(map.get(3).toString());
	     
	
	}
}

class Employee {
	String name, city;

	public Employee(String name, String city) {
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
	
	return " "+this.name+this.city;
	}
}