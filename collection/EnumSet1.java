package com.divergent.corejava.collection;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSet1 {
	public static void main(String[] args) {
		Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
		// Traversing elements
		Iterator<days> iter = set.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());

		Set<days> s = EnumSet.allOf(days.class);
		System.out.println(s);
	}

}
