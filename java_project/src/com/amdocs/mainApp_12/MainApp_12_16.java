package com.amdocs.mainApp_12;

import java.util.Random;

/**
 * Random Stream of data!
 * 
 * java.util.Random class provides ints(), longs(), doubles(), methods that returns infinite IntStream, LongStream, DoubleStream respectively
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
	}

}
