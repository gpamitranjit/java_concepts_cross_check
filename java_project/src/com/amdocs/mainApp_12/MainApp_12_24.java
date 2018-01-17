package com.amdocs.mainApp_12;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * 
 * @author amit
 *
 */
public class MainApp_12_24 {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
			x = x + y;
		};
		
		BinaryOperator<Integer> binaryOperator = (x, y) -> {
			return x = x + y;
		};
		
		BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> {
			return x + y;
		};
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		int sum = intList.stream()
					.reduce(0, biFunction, binaryOperator);

		System.out.println("sum of the integer elements is: " + sum);
		
		
	}

}
