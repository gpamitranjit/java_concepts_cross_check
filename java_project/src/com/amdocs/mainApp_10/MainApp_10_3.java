package com.amdocs.mainApp_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Java 8 stream apis that return new stream are called intermediate operations are called intermediate operations
 * Most of the time these operations are lazy in nature and this help in lazy evaluations eventually which will lead to improved performance of the application.
 * 
 * Once the terminal operations is called on the stream the stream will be consumed and it can't be used again!
 * 
 * Terminal operations are eager in nature!, they process all the elements before producing the final result.
 * commonly used terminal operations are forEach, toArray, min, max, findFirst, anyMatch, allMatch and many more..
 * 
 * One can identity the terminal operations by checking method return types (i.e. java 8 terminal operations never return new stream they just process the final stream!)
 *
 * @author amit
 *
 */
public class MainApp_10_3 {

	public static void main(String[] args) {
		try {
//	There are several ways through which we can create stream of data!
//		let's look at different ways' of producing the stream of data.
		
//		using Stream.of() method of java 8 stream api
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
		intStream.forEach(intValue -> {
			System.out.println(intValue);
		});
		
		System.out.println("===============================================");
/*		When using Stream.of() method to produce the stream of data the autoboxing is not supported!
		this is done for performance reason, for Example below statement produces compile time error.
*/

/*		Stream<Integer> intStream_2 = Stream.of(new int[]{1, 2, 3, 4, 5});
		intStream_2.forEach(intValue ->  {
			System.out.println(intValue);
		});
*/		
		
		System.out.println("================================================");
		Stream<Integer> intStream_3 = Stream.of(new Integer[] {1, 2, 3, 4, 5});
		intStream_3.forEach(intValue ->  {
			System.out.println(intValue);
		});

		System.out.println("================================================");
		System.out.println("Processing primitive values directly..");
		Stream<int[]> intStream_4 = Stream.of(new int[] {1, 2, 3, 4, 5});
		intStream_4.forEach(intValue ->  {
			IntStream intStream_6 = IntStream.of(intValue);
			intStream_6.forEach(innerValue ->  {
				System.out.println(innerValue);
			});
		});
		
		
		
		
//		Creating Stream of data with Stream() and parallelStream() constructors
		System.out.println("====================================================");
		List<Integer> intList = new ArrayList<>();
		for(int i=0; i < 1000; i++) {
			intList.add(i);
		}
		
//		creating Sequential stream
		Stream<Integer> sequentialStream = intList.stream();
		long startTime = 0L;
		long endTime = 0L;
		
		startTime = System.nanoTime();
		sequentialStream.forEach(intValue -> {
			System.out.print(intValue + ", ");
		});
		endTime = System.nanoTime();
		System.out.println("\n\ntotal time for processing elements seqentaially: " + (endTime - startTime)*(1.0/1000000) + " milli seconds");
		
		
//		creating parallel stream but still we aren't using any intermediate operations for increasing performance
		Stream<Integer> parallelStream = intList.parallelStream();
		startTime = System.nanoTime();
		parallelStream.forEach(intValue -> {
			System.out.print(intValue + ", ");
		});
		endTime = System.nanoTime();
		System.out.println("\n\ntotal time for processing elements parallelly: " + (endTime - startTime)*(1.0/1000000) + " milli seconds");
		
		
		}catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
