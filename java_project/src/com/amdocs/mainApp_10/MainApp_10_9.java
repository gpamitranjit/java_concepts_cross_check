package com.amdocs.mainApp_10;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Now using toArray() method of Stream API to convert stream of data into array of data.
 * @author amit
 *
 */
public class MainApp_10_9 {

	public static void main(String[] args) {
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
		Integer[] intArray = intStream.toArray(Integer[]::new);
		System.out.println("arrays is: " + Arrays.toString(intArray));
	}

}
