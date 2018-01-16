package com.amdocs.mainApp_12;

import java.util.stream.Stream;

/**
 * Usage of Steam.generate() method in Stream API
 * 
 * @author amit
 *
 */
public class MainApp_12_14 {

	public static void main(String[] args) {
		
//		using lambada expression way to provide generator supplier
		Stream.generate(() -> (int)(Math.random() * 1000))
			.limit(10)
			.forEach(System.out::println);
		
		
		System.out.println("using functional interface way ");
//		using functional interface way to provide suppiler
		Stream.generate(Math::random)
			.limit(10)
			.map(value -> (int) (value * 1000))
			.forEach(System.out::println);
	}

}
