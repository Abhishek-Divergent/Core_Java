package com.divergent.corejava.assignment4;

public class StaticBinding {
	public void nameOfAnimal() {
		System.out.println("Name of Anmial is Dog");
	}

	public static void main(String[] args) {

		StaticBinding binding = new StaticBinding();
		binding.nameOfAnimal();

	}

}
