package com.divergent.corejava.assignment4;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * THIS CLASS CONTAIN BOTH method equal and hashCode method both are override
 * 
 * @author JAI MAHAKAL
 *
 */
public class EqualHashMethodExample {

	public static void main(String[] args) {
		Pen pen = new Pen("blue", 10);
		Pen pen1 = new Pen("blue", 10);
		System.out.println(pen.equals(pen1) + "\n");
		System.out.println("This is Pen object 1 Hash Code" + pen.hashCode());
		System.out.println("This is Pen object 2 Hash Code" + pen1.hashCode());
		System.out.println("Object hash code  is  equal  " + (pen.hashCode() == pen1.hashCode()));

		Set<Pen> set = new HashSet<>();
		set.add(pen);
		set.add(pen);
		set.add(pen1);

		System.out.println(set);
	}
}

class Pen {
	String color;
	int price;

	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	/**
	 * this is override hashCode method in this method are returning hashCode of
	 * object hashCode
	 */
	public int hashCode() {
		return Objects.hash(color, price);

	}

	@Override
	public boolean equals(Object obj) {
		Pen p = (Pen) obj;
		if (!(this instanceof Pen)) { // pen.equals pen1
			return false;
		}

		if (null == p) {
			return false;
		} else if (this == p) {
			return true;
		} else if (this.color.equals(p.color) && this.price == p.price) {
			return true;
//		} else if (getClass() == p.getClass()) {
//			return true;
		} else
			return false;
	}

}