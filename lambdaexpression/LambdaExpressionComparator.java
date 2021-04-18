package com.divergent.corejava.lambdaexpression;

import java.util.List;

public class LambdaExpressionComparator {

	public static void main(String[] args) {


		List<Integer> number = List.of(21,2,-1,16,13,14);
//		Integer min = number.stream()
//				.min((x,y)->x.
//				compareTo(y)).
//				get();
		
		
		
		Integer i= number.stream().min((a,b)->a.compareTo(b)).get();
				System.out.println(i);
	
	}

}
