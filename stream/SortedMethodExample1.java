package com.divergent.corejava.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class SortedMethodExample1 {
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

		List<String> stringlist = new ArrayList<>();
		stringlist.add("Abhishek");
		stringlist.add("Ram");
		stringlist.add("Tarik");
		stringlist.add("Bhanu");
		stringlist.add("kallu");
		stringlist.add("sita");
		stringlist.add("Cat");
		// sorting integer list by sorted list
		List<Integer> tempint = new ArrayList<>();
		tempint = intlist.stream().sorted().collect(Collectors.toList());

		myLogger.info(" Before Sort list :" + intlist);
		myLogger.info("Sorted list :" + tempint);
		List<String> tempstring = new ArrayList<>();
		tempstring = stringlist.stream().sorted().collect(Collectors.toList());

		myLogger.info(" Before Sorted list :" + stringlist);
		myLogger.info("Sorted list :" + tempstring);

	}

}
