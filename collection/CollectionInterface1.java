package com.divergent.corejava.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionInterface1 {

	public static void main(String[] args) {
     Collection<String> c=new ArrayList<String>();
     c.add("1");
     c.add("2");
     c.add("3");
     c.add("5");
     c.add("4");
     c.add("2");
     System.out.println(c);
     c.remove("2");
     System.out.println(c);
     Collections.addAll(c, "Rahul", "OM", "Prem");
     System.out.println(c);	}

}
