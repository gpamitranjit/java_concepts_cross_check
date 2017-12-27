package com.amdocs.mainApp_9;

import java.util.stream.Stream;

public class MainApp_9_10 {

	public static void main(String[] args) {
/*	Stream.distinct method returns a stream consisting of the distinct elements of this stream.
 * Internally it uses Object.equals() method for check.
 * 
 *  For ordered streams, the selection of distinct element is stable (i.e for duplicate elements, the element appearing first in the encounter order is preserved)
 *  For unordered streams, no stability guarantees are made.
		
*/		
		
		Stream.of("bus", "car", "bycycle", "bus", "car", "car", "bike")
				.distinct()
				.forEach(System.out::println);
	}

}
