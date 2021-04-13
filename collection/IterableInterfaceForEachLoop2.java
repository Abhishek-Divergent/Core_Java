package com.divergent.corejava.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * 
 *  iterate list using enhanced for loop
 * @author JAI MAHAKAL
 *
 */
public class IterableInterfaceForEachLoop2 {
private final static Logger myLogger=Logger.getLogger("com.divergent.corejava.collection");
	public static void main(String[] args) {
		myLogger.setLevel(Level.ALL);
		// list
		List<String> li = new ArrayList<>();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		li.add("e");
		// enhanced for loop
		 myLogger.info("List By Enhanced Loop");
		li.forEach((element) ->{ System.out.println(element);});
	}

}
