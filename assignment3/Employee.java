package com.divergent.corejava.assignment3;

import java.time.LocalDate;

/**
 * employee class will store employee data
 * 
 * @author JAI MAHAKAL
 *
 */
public class Employee {
	private final String name;
	private final LocalDate hireDate;
	private final Double salary;

	/**
	 * 
	 * @param name     employee name
	 * @param hireDate date of joining
	 * @param salary   salary of employee
	 */
	public Employee(String name, LocalDate hireDate, Double salary) {
     
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public Double getSalary() {
		return salary;
	}

	/**
	 * this is static method this will create object as often as
	 * 
	 * @param name
	 * @param hireDate
	 * @param salary
	 * @return
	 */
	public static Employee StaticMethod(String name, LocalDate hireDate, Double salary) {
		return new Employee(name, hireDate, salary);
	}

	public static void main(String[] args) {
		Employee employee[] = new Employee[4];
		employee[0] = StaticMethod("Abhisek Sahu", LocalDate.of(2021, 03, 28), 123.234);
		employee[1] = StaticMethod("ram", LocalDate.of(2021, 03, 28), 1221233.234);
		employee[2] = StaticMethod("bharat", LocalDate.of(2021, 03, 28), 124523.234);
		employee[3] = StaticMethod("kallu sahu ", LocalDate.of(2021, 03, 28), 3423.234);
		var s = StaticMethod("kallu sahu ", LocalDate.of(2021, 03, 28), 12423423.234);
		for (Employee e : employee) {
			System.out.println(e.getName() + "  " + e.getSalary() + " " + e.getHireDate());
		}
		System.out.println(s.equals(employee[3]));

	}
	
	public boolean equals(Employee e) {
		return this.name.equals(e.name) ;
		
	}
	

}
