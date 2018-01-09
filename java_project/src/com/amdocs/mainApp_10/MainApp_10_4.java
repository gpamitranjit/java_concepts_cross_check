package com.amdocs.mainApp_10;

import java.util.stream.Stream;

/**
 * @author amit
 *
 */
public class MainApp_10_4 {

	public static void main(String[] args) {
//		Another way of Creating the Stream of data is by using Stream.generate() and Stream.iterate() methods
		
//		this will generate infinite number of "abc" strings
		Stream<String> stringStream = Stream.generate(() -> {return "abc";});
		stringStream.forEach(stringValue -> {
			System.out.println(stringValue);
		});
	}

}
