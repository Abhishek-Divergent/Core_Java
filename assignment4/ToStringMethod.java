package com.divergent.corejava.assignment4;

public class ToStringMethod {

	public static void main(String[] args) {
		Employee e1 = new Employee("jayant", 10);
		Employee e2 = new Employee("kallu ram", 10);

		System.out.println("Employee E1 :" + e1);
		System.out.println("Employee E2 :" + e2);

	}

}

class Employee {
	String name;
	int price;

	public Employee(String string, int i) {
		name = string;
		price = i;
	}

	@Override
	public String toString() {
		return "Name : " + name + "     Price : " + price;
	}

}
