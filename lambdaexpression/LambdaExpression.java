package com.divergent.corejava.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {

		List<String> numbers = new ArrayList<>();
		numbers.add("Abhishek sahu 1");
		numbers.add("Abhishek sahu 2");
		numbers.add("Abhishek sahu 2");

//		for (String string : numbers) {  this is normal way
//			System.out.println(string);
//
//		}
		numbers.forEach((a) -> {
			System.out.println(a);
		});

	}

}
