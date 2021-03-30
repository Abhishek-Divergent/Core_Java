package com.divergent.corejava.assignment3;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		System.out.println("Default constructor");

	}

	public ConstructorOverloading(int x) {
      System.out.println(x);
	}

	public ConstructorOverloading(int x, int y) {
		 System.out.println(x+y);
	}

	public ConstructorOverloading(int x, int y, int z) {
		 System.out.println(x+y+z);
	}

	public static void main(String args[]) {
     ConstructorOverloading overloading=new ConstructorOverloading();
     ConstructorOverloading overloading2=new ConstructorOverloading(10);
     ConstructorOverloading overloading3=new ConstructorOverloading(12, 78);
     ConstructorOverloading overloading4=new ConstructorOverloading(12, 124, 123); 
	}

}
