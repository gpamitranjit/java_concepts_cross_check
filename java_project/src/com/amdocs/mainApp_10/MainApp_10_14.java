package com.amdocs.mainApp_10;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * This example application illustrate the use of reduce() terminal operation,
 * with the help  of associate accumulator function to produce final result.
 * 
 * @author amit
 *
 */
public class MainApp_10_14 {

	public static void main(String[] args) {
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
		Optional<Integer> intOptional = intStream.reduce((i, j) -> i * j);
		if(intOptional.isPresent()) {
			System.out.println("Multiplication of stream of elements: " + intOptional.get());
		}
		else {
			System.out.println("There exist no element to performation reduction operations!");
		}
	}

}
