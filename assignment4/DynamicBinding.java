package com.divergent.corejava.assignment4;

class Animal {
	void nameOfAnimal() {
		System.out.println("This is cat");
	}
}

public class DynamicBinding extends Animal {

	void nameOfAnimal() {
		// super.nameOfAnimal();
		System.out.println("this is Dog");
	}

	public static void main(String[] args) {

		/**
		 * Here i am binding object of one class to other class
		 */
		Animal animal = new Animal();
		animal.nameOfAnimal();
		animal = new DynamicBinding();
		animal.nameOfAnimal();
	}

}
