package com.amdocs.mainApp_10;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This example application make use of sorted() method of comparator as method argument to sort the stream elements!
 * 
 * @author amit
 *
 */
public class MainApp_10_12 {

	public static void main(String[] args) {
		try{
		Stream<String> stringStream = Stream.of("ranjit", "amit", "sonu", "smita", "preeti", "baby");
		
//		sorting the stream elements based on the reverseOrder sorting method of comparator
		List<String> stringList = stringStream.sorted(Comparator.reverseOrder())
											.collect(Collectors.toList());
		System.out.println("Reverse ordered elements: " + stringList);
		
//		sorting the stream of elements in ascending order.
		Stream<String> stringStream_2 = Stream.of("ranjit", "amit", "sonu", "smita", "preeti", "baby");
		List<String> stringList_2  = stringStream_2.sorted().collect(Collectors.toList());
		System.out.println("Ascending ordered elements: "+ stringList_2);
		
		
		}catch(Exception e) {
			System.err.println("Exception: "+ e.getMessage());
			e.printStackTrace();
		}
	}

}
