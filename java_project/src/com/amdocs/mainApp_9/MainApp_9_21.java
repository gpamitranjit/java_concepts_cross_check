package com.amdocs.mainApp_9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainApp_9_21 {

	public static void main(String[] args) {
/* using Lambada Expression to pass the behavior to the target method!
 * 		
		
*/	
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(60);
		numbers.add(19);
		
		int result_1 = sumWithCondition(numbers, i -> i > 10);
		System.out.println("\n predicate which sum all the elments that are greater than 10: " + result_1);
		
		Predicate<Integer> predicate_1 = i -> i < 50;
		
		int result_2 = sumWithCondition(numbers, predicate_1);
		System.out.println("sum of all the elements that are less than 50: " + result_2);
		
		
		Predicate<Integer> predicate_2 = i -> i % 2 == 0;
		int result_3 = sumWithCondition(numbers, predicate_2);
		System.out.println("sum of all the elements that are divisible by 2 (sum of all even numbers): " + result_3);
	}

	private static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
		return numbers.parallelStream()
					.filter(predicate)
					.mapToInt(i -> i)
					.sum();
	}
}
