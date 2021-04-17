package com.divergent.corejava.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class CollectorsWithCounting {
	private final static Logger myLogger = Logger.getLogger(FilterMethodExample1.class.getName());
	public static void main(String[] args) {
		List<Integer> intlist = new ArrayList<>();
		intlist.add(1);
		intlist.add(9);
		intlist.add(8);
		intlist.add(12);
		intlist.add(3);
		intlist.add(0);
		intlist.add(5);
		intlist.add(4);
		
		
		
		
	   Long temp = intlist.stream().sorted().collect(Collectors.counting());
	   myLogger.info(temp+"");

	}

}
