package com.divergent.corejava.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class ForEachMethodExample1 {
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
		
		intlist.stream().forEach(l ->{System.out.print(l+" ");});
		intlist.stream().forEach(l ->{ myLogger.info("\n"+l+" ");});
		


	}

}
