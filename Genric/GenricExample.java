package com.divergent.corejava.Genric;

public class GenricExample {
	/*
	 * public void printArray(String[] array) {
	 * 
	 * for (int i = 0; i < array.length; i++) { System.out.println(array[i]); } }
	 * 
	 * public void printArray(int[] array) {
	 * 
	 * for (int i = 0; i < array.length; i++) { System.out.println(array[i]); }
	 * 
	 * }
	 */
	public <E> void printArray(E   []array) {
		//for (int i = 0; i < array.length; i++) { System.out.println(array[i]); }
	for (E e : array) {
		 System.out.println(e);
	}
	}
	

	public static void main(String[] args) {
		GenricExample example = new GenricExample();

		String[] str = { "abhishek", "sahu" };
		Integer a[] = { 1, 2, 3, 4 };
		Double d[]= {1233.23,1312.12, 12312.22};
		example.printArray(str);
		example.printArray(a);
		example.printArray(d);

	}

}
