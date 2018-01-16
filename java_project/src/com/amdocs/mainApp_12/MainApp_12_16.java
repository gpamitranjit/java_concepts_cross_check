package com.amdocs.mainApp_12;

import java.util.Random;
import java.util.stream.Stream;

/**
 * Random Stream of data!
 * 
 * java.util.Random class provides ints(), longs(), doubles(), methods that returns infinite IntStream, LongStream, DoubleStream respectively
 * 
 * to work only with primitive types, use the generate() method of stream API
 * 
 * @author amit
 *
 */
public class MainApp_12_16 {

	public static void main(String[] args) {
//		The following code prints 10 random values returned from ints() method of Random class
		new Random().ints()
			.limit(10)
			.forEach(System.out::println);
		
		
		System.out.println("====================================================================");
//		we can use nextInt() method of the Random class as the supplier in the generate() method
//		to achieve the same result.
		Stream.generate(new Random()::nextInt)
			.limit(10)
			.forEach(System.out::println);
		
		
	}

}
