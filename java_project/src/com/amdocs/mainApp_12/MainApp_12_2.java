package com.amdocs.mainApp_12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Intermediate operations and terminal operations
 * 	Stream API supports two types of operations
 * 			*	Intermediate operations
 * 			*	Terminal operations
 * 
 *  Intermediate operations are also called lazy operations
 *  Terminal operations are also called eager operations
 *  
 *  Lazy operations doesn't process the elements until an eager operations is called on the stream.
 *  
 *  An intermediate operations on the stream produces another stream
 *  
 *  Streams link operations to create a stream of pipeline.
 *  
 *  
 *  		**Ordered Stream Vs Unordered Stream
 *  A stream can be ordered stream or unordered stream
 *  
 *  An ordered stream keeps the ordered of it's elements
 *  
 *  The stream API can convert an ordered stream, which may represent,
 *  an ordered data structure such as List or a sorted set, into an unordered stream.
 *  
 *  We can also convert an unordered stream of data into ordered stream of data by applying sorting intermediate operations
 *  
 * @author amit
 *
 */
public class MainApp_12_2 {

	public static void main(String[] args) {
		
//		here filter() and map() are lazy operations and reduce() is a eager operations
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> intStream = intList.parallelStream();
		int sum = intStream.filter(intValue ->  { return intValue % 2 == 1;})
						.map(intValue -> { return intValue * intValue;})
						.reduce(0, Integer::sum);
		System.out.println("sum of square of odd integers of the stream: " + sum);
	
		
		
//		converting unordered stream of data into ordered stream of data

//		processing the stream sequentially 
		List<Integer> intList_2 = Arrays.asList(3,7,9,3,1,2,1, 2, 3, 4, 5);
		intList_2.stream()
			.sorted()
			.forEach(intValue -> System.out.print(intValue + ", "));

		System.out.println();
//		processing the stream parallely			<--- Note: the aggregated data is not sorted when processed parallely!!
		List<Integer> intList_3 = Arrays.asList(3,7,9,3,1,2,1, 2, 3, 4, 5);
		intList_3.parallelStream()
			.sorted()
			.forEach(intValue -> System.out.print(intValue + ", "));
		
	}

}
