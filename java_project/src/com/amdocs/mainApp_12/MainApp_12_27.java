package com.amdocs.mainApp_12;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * use of reduce(BinaryOperator<T> accumulator) of stream API
 * If the stream is empty then Optional<T> is used to wrap the empty result otherwise Optional<T> with valid value in it will be returned
 * 
 * @author amit
 *
 */
public class MainApp_12_27 {

	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = (intValue1, intValue2) -> {
			int max = intValue1;
			if(intValue2 > max) {
					max = intValue2;
				}
			return max;
		};
		
//		using user defined binaryOperator for finding maximum of given stream of integers
		Optional<Integer> max = Stream.of(1, 2, 3, 10,  4, 5, 10).reduce(binaryOperator);	// at the simplest you can use lambda expression as (p1,p2) -> p1.getIncome() > p2.getIncome() ? p1 : p2;
		if(max.isPresent())
			System.out.println("max of given stream of intergers is: " + max.get());
		else
			System.out.println("no max value present int the stream of data");
		
//		using empty stream of data to check if the optional value
		Optional<Integer> max_2  = Stream.<Integer>empty().reduce(Integer::max);
		if(max_2.isPresent())
			System.out.println("max in empty stream of data: " + max_2.get());
		else
			System.out.println("No value exist in the resultant stream!");
		
		
	}

}
