package com.amdocs.mainApp_12;

import java.util.stream.IntStream;

/**
 * Creating intStream from a range of values!
 * we can use following 2 methods from IntStream interface to create IntStream from a range of int values
 * 	1. IntStream range(int start, int end);
 * 	2. IntStream rangeClosed(int start, int end);
 * 
 * The specified end is exclusive in the range() method and inclusive in the rangeClosed() method
 * 
 * Above two methods create an ordered integers between start and end 
 *
 * @author amit
 *
 */
public class MainApp_12_5 {

	public static void main(String[] args) {
		IntStream oneTo5 = IntStream.range(1, 6);
		oneTo5.forEach(System.out::println);
		
		System.out.println("=====================================");
		IntStream oneto5_2 = IntStream.rangeClosed(1, 5);
		oneto5_2.forEach(System.out::println);
	}

}
