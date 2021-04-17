package com.divergent.corejava.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Map method of stream class in this class print square of each number through
 * Map method
 * 
 * @author JAI MAHAKAL
 *
 */
public class MapMethodExample1 {
	private final static Logger myLogger = Logger.getLogger(FilterMethodExample1.class.getName());

	public static void main(String[] args) {
		List<Integer> intlist = new ArrayList<>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		intlist.add(4);
		intlist.add(5);
		intlist.add(6);
		intlist.add(7);
		intlist.add(8);
		intlist.add(9);
		intlist.add(10);

	//	List<Integer> temp = intlist.stream().map(x -> x * x * x).collect(Collectors.toList());
	    Set<Integer> temp= intlist.stream().map(x -> x * x * x).collect(Collectors.toSet());
		myLogger.info(" Before Sort list :" + intlist);
		myLogger.info("Sorted list :" + temp);

	
	}

}
