package com.divergent.corejava.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 *  iterate list using for loop
 */
public class IterableInterfaceForLoop1 {
	private final static Logger myLogger = Logger.getLogger("com.divergent.corejava.collection.IterableInterface1");

	public static void main(String[] args) {
		// set level of mylogger
		myLogger.setLevel(Level.INFO);
		//list
		List<String> l = new ArrayList<>();
		l.add("Abhiiekser");
		l.add("Ajdfhjhgekser");
		l.add("Abh45454r");
		//loop
		myLogger.info("List ");
		for (String string : l) {
			System.out.println(string);
		}
	}

}
