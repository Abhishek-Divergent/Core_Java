package com.divergent.corejava.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ReduceMethod {
	private final static Logger myLogger = Logger.getLogger(FilterMethodExample1.class.getName());
	public static void main(String[] args) {
		List<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		intlist.add(4);
		intlist.add(5);
		intlist.add(6);
		intlist.add(8);
		intlist.add(7);
		intlist.add(9);
		int result=intlist.stream().filter(p -> p % 2 == 0).reduce(0,(ans,i)->ans+i);
		
		myLogger.info("Result: " + result);	}

}
