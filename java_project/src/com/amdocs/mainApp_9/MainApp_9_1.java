package com.amdocs.mainApp_9;

import java.util.Arrays;
import java.util.List;

/**
 * @author Amit
 *
 */
public class MainApp_9_1 {

	public static void main(String[] args) {
/*	Useful information:
		This example application illustrates the use of java 8 stream's
		Java 8 streams are not collections!, they are introduced to process the elements
		java Streams wraps the collections and arrays to support the operations expressed via Lambada expressions
		So we specify only what we want to do, but not how we want to accomplish that task!
		
		With this example application we will learn about the processing order
		and how the ordering of stream operations affect runtime performance!
		
		Streams are not collections, they differ in following ways'
		1. No storage: A strea is not a data structure that store elements; instead it conveys elements from source,
			such as a data structure, an array, a generation function or an I/O channel, through a pipeline of
			computational operations.
		2. Functional In nature:An operation on a stream produces a result, but doesn't modify it's source.
		   For example, filtering a stream obtained from a collection produces a new stream with the filtered elements
		   rather than removing elements from the source collection.
		3. Laziness-seeking: Many stream operations, such as filtering, mapping, or duplicate removal, can be implemented lazily,
		   exposing opportunities for optimization.
		   For example, finding the first string with three consecutive vowels, need not examine all the inputs strings
		   stream operations are divided into intermediate (i.e Stream-producing) operations and terminal Operations.
		   Intermediate operations are always lazy!!
		4. Possibly unbounded: while collections have finite size, streams need not. short-circuting operations such as limit(n) or findFirst(n)
		   can allow computations on infinite streams to complete in finite time.
		5. Consumable: The elements of a stream are only visited once during the life of a stream.
		
	Important : Streams support functional style of operations on stream of elements.
		such as map-reduce transformation on collections and many more.
		Stream operations are divided into intermediate operations and terminal operations
		and are combined to form a stream pipeline.
	
		A Stream pipeline consists of a source (such as Collection, an array, a generator function or an I/O channel);
		followed by zero or more intermediate operations (such as Stream.filter or Stream.map),
		and Terminal operations (such as Stream.forEach or Stream.reduce) to produce the final result.
		
		Terminal operations, such as Stream.forEach or IntStream.sum, may traverse the stream to produce a result or a side-effect
		After a terminal operations is performed, the stream pipeline is considered as consumed, an can never be used again.
		if you want to traverse the same data again, then you have to obtain new stream from data source.
		in almost all the cases terminal operations are eager, completing thier traverse of data and processing of the data before 
		they return the result.
		
		iterator() and splititerator() are not eager terminal operations.
		
		intermediate operations are further divided into stateful and stateless operations.
*/
		
		
//		sorting the elements of the list based on charaters of each data, transforming the data to uppercase and then sorting the result.
		
		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
		
		vehicles.stream().filter(str -> str.length() > 3).map(String:: toUpperCase).sorted().forEach(System.out::println);
	}

}
