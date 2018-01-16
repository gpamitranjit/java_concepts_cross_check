package com.amdocs.mainApp_12;

import java.util.stream.Stream;

/**
 * use of Stream.generate() method that generates the values using previous value
 * 
 * @author amit
 *
 */
public class MainApp_12_15 {

	public static void main(String[] args) {
//		Create the supplier for Stream.generate() method that uses previous value to generate current value
		Stream.generate(MainApp_12_15::next)
			.limit(10)
			.forEach(System.out::println);
	}
	
	private static int i=0;
	private static int next() {
		i++;
		return i;
	}

}
