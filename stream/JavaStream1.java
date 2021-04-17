package com.divergent.corejava.stream;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * this class contain all basic method that related to stream
 * 
 * @author JAI MAHAKAL
 *
 */
public class JavaStream1 {
	public static void main(String[] args) {
		// 1 Normal Way
		List<Integer> list = List.of(1, 2, 3, 4, 5, 8, 6, 7, 9);
		System.out.println(list);
		// List.of method create list but you can't add any item
		// list.add(45);
		// System.out.println(list);java.lang.UnsupportedOperationException

		// 2 way
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(45);
		list1.add(45);
		list1.add(45);
		System.out.println(list1);

		// Arrays.asList(12, 12, 8458, 21, 54, 21);
		System.out.println(Arrays.asList(12, 12, 8458, 21, 54, 21));

		// find even number
		// List without stream
		for (int i : list) {
			if (i % 2 == 0) {
				System.out.print(i + "  ");
			}
		}

		// list With stream
		Stream<Integer> stream = list.stream();

		// Filter Method
		List<Integer> newlist = stream.filter(p -> p % 2 == 0).collect(Collectors.toList());
		System.out.println("\n" + newlist);

		// Sorted Method
		List<Integer> newlist1 = stream.sorted().collect(Collectors.toList());
		System.out.println("\n" + newlist1);
		// Map Method
		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());

		System.out.println(square);
		// ForEach Method
		List<Integer> number1 = Arrays.asList(200, 300, 400, 500, 600);
		number1.stream().map(x -> x * x).forEach(y -> System.out.print(y + " "));

	}

}