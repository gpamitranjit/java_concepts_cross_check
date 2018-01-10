package com.amdocs.mainApp_10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This example application illustrate the use of map() method,
 *  to apply a function for each elements of the stream to produce the new stream based on the application of the function!
 * 
 * @author amit
 *
 */
public class MainApp_10_11 {

	public static void main(String[] args) {
//		Here we are applying upperCase function to each elements of the stream to produce new stream!
//		Then we collect the stream elements using collectors' toList() method
		Stream<String> stringStream = Stream.of("amit", "ranjit", "sonu", "Smita", "Preeti", "baby");
		List<String> stringList = stringStream.map(stringValue -> {
			return stringValue.toUpperCase();
		}).collect(Collectors.toList());
		
		System.out.println("final List: " + stringList);
	}

}
