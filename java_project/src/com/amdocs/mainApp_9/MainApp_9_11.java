package com.amdocs.mainApp_9;

import java.util.stream.Stream;

public class MainApp_9_11 {

	public static void main(String[] args) {
/*	This example application showcase the use of Stream.sorted() method
 * Stream.sorted() method returns a sorted stream in the natual order by default,
 * You can provide your own comparator for sorting order.
 * 
 * In case if you are going to continue with the default sorting order,
 * and if the objects are not compatible for sorting process then java.lang.ClassCastException will be thrown when the terminal operation is executed.
 * 	
*/	
		
		Stream.of("bus", "car", "train", "flight", "bike")
				.sorted()
				.limit(2)
				.forEach((String str) -> {
					System.out.println(str);
				});
		
	}

}
