package com.divergent.corejava.assignment3;

import java.time.LocalDate;

public class StaticFactoryMethod {

	public static void main(String[] args) {

		FactoryMethod f1 = FactoryMethod.getCurrentDateInstance();
		FactoryMethod f2 = FactoryMethod.getGivenDateInstance(2017, 10, 5);

		System.out.println(f1.date);
		System.out.println(f2.date);

	}

}

class FactoryMethod {

	LocalDate date = null;

	private FactoryMethod() {

	}

	public static FactoryMethod getCurrentDateInstance() {
		FactoryMethod f = new FactoryMethod();
		f.date = LocalDate.now();
		return f;
	}

	public static FactoryMethod getGivenDateInstance(int year, int month, int date) {
		FactoryMethod f = new FactoryMethod();
		f.date = LocalDate.of(year, month, date);
		return f;
	}

}