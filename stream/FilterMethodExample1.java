package com.divergent.corejava.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * this using Filter method to filter list and collect method to filter list
 * 
 * @author JAI MAHAKAL
 *
 */
public class FilterMethodExample1 {
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

		// normal way
		// this is traditional way to filter list

		List<Integer> templist = new ArrayList<Integer>();
		for (int integer : intlist) {

			if (integer % 2 == 0) {
				templist.add(integer);
			}

		}
		myLogger.info("Even Number List" + templist);
		// using stream
		// using filter method find even number given list
		List<Integer> filterEvenList = intlist.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
		myLogger.info(" This is Even Number From List :" + filterEvenList);
		List<Integer> filterOddList = intlist.stream().filter(p -> p % 2 != 0).collect(Collectors.toList());
		myLogger.info("This is Odd number From list " + filterOddList);

	}

}
