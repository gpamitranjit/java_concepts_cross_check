package com.amdocs.mainApp_10;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * We will Create primitive valued stream of data by using Arrays.stream() and String.chars() method of stream API
 * @author amit
 *
 */
public class MainApp_10_7 {

	public static void main(String[] args) {
//		Creating the stream of data by using Arrays.stream() and String.chars() method of stream API
		LongStream longStream = Arrays.stream(new long[] {1, 2, 3, 4, 5});
		longStream.forEach(longValue -> {
			System.out.println(longValue);
		});
		
		System.out.println("=================================================");
//		Generating the ASCI equivalent int values from character stream of data!
		IntStream intStream = "abc".chars();
		intStream.forEach(intValue -> {
			System.out.println(intValue);
		});
		
		
		
	}

}
