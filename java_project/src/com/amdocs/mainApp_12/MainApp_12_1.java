package com.amdocs.mainApp_12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Collections Vs Streams!,
 * Java collections focus on how to store data elements for efficient access
 * Java Streams focus on aggregate operations on data elements from a data source
 * 
 * 		Java Streams features
 * 1. No Storage:
 * 	Java stream have no storage
 * 	A collection is an in-memory data structure that stores all of it's elements
 * 	A stream pulls data element on-demand and passes them to a pipeline of operations for processing
 *  For a collection we talk about the storage or how the elements are stored and how the data elements are accessed
 *  
 *  
 *  For a stream we focus on operations not on the implementation in-general
 *  
 * 2. Infinite Streams
 * 	A collection can't represent a group of infinite elements whereas a stream can!
 * 	A stream data can be generated from different datasource such file, i/o channel, collections of data..
 * 	A stream can pull the data from a function that generate infinite number of data elements
 * 
 * 3. Not Reusable
 * 	Streams are not reusable
 * 	A stream can't be reused after calling terminal operations
 * 	to perform the operations on the same data elements we have recreate the pipeline of data using stream
 * 
 *	If a closed stream is used then it will throw IlligalStateException!
 *  
 *  
 *  
 *  ******************************************************************************
 *  	Imperative Vs Functional
 *  In imperative programming  we control not only what to do but also how to do it.
 *  For Example, when using imperative programming to sum integers in a list,
 *  we have to decide how to iterate each elements in the list...for this either we use for loop or foreach loop
 *  and finally we have to do sum!
 *  
 *  In Declarative programming we just need to tell what to do, the how part is handled by the system itself
 *  
 *  Collections support imperative programming whereas streams support declarative programming
 *  
 *  The stream API supports the functional programming by using lambda expression.
 *  What operations to be performed on the stream are typically expressed using lambda expression!
 *  
 *  
 *  Operations on the stream of data produces the result without modifying the data source!!
 *  
 *  
 *  
 * @author amit
 *
 */
public class MainApp_12_1 {

	public static void main(String[] args) {
//		Calculate the sum of square of odd integer elements of the stream.
		
//		processing the elements sequentially! 
 		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);
		Stream<Integer> intStream = intList.stream();
		int sum = intStream.filter(intvalue -> {
			return intvalue%2 !=0;
		}).map(intValue -> intValue * intValue)
				.reduce(0, Integer::sum);
		System.out.println("sum of square of odd integer elements of stream of elements is: " + sum);
		
		
		System.out.println("=======================================================================");
//		processing the elements parallelly!
		List<Integer> intList_2 = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> intStream_2 = intList_2.parallelStream();
		int sum_2 = intStream_2.filter(intValue -> {
						System.out.println("filtering-- Thread: " + Thread.currentThread().getName());
						return intValue%2 != 0;
					}).map(intValue -> {
						System.out.println("mapping---- Thread: " + Thread.currentThread().getName());
						return intValue * intValue;
					})
					.reduce(0, Integer::sum);
		
		System.out.println("sum of square of odd integer elements of stream of elements is: " + sum_2);
	}

}
