package com.amdocs.mainApp_9;

import java.util.stream.Stream;

public class MainApp_9_13 {

	public static void main(String[] args) {
/* The Stream.reduce() method is reduction operation.
 * A reduction operation takes a sequence of input elements and combines them into a single summary result by repeated application of a combining operation.
 * 
 * The Stream.reduceI() method comes in 3 variants!
 * 		
*/	
		System.out.println("===========================================================");
		System.out.println("Stream.reduce() method with Accumulator!");
		Stream.of(10, 20, 30).reduce((x,y) -> x + y).ifPresent(System.out::println);
		
		Stream.of(10, 20, 30).reduce(Integer::sum).ifPresent(System.out::println);
		
		Stream.of("java", "c++", "c#", "python").reduce((x, y) -> x + " | " + y).ifPresent(System.out::println);
		
		
		
		
		System.out.println("===========================================================");
		System.out.println("Stream.reduce() method with Identity and Accumulator");
		
		Integer arrSum = Stream.of(10, 20, 30).reduce(100, Integer::sum);
		System.out.println("sum of all element + 100: " + arrSum);
		
		Integer arrSum_2 = Stream.of(10, 20, 30).reduce(100, (x,y) -> x+y);
		System.out.println("sum of all element + 100: " + arrSum_2);
		
		String result = Stream.of("java", "c++", "c#", "python").reduce("Languages: ", (x, y) -> x  + " | " + y);
		System.out.println(result);
		
		
		
		System.out.println("===========================================================");
		System.out.println("Stream.reduce() method with Identity, Accumulator and Combiner");
		System.out.println("the Combiner takes two parameters!!,");
		System.out.println("First is partial result of all the stream at the moment (i.e all the process elements so far!) and final reduction of stream of data will produce another final result.");
		System.out.println("in this case Identity value will be the inital value of all the streams so for this example ->1000 + 1000 + 1000 + (reduced result of all elements of data stream)");
		
		Integer arrSum_3 = Stream.of(10, 20, 30).parallel().reduce(1000, (x, y) -> x+y, (p,q) -> {
			System.out.println("combiner called");
			return p+q;
			});
		System.out.println("sum of all parallelstreams with identity value: " + arrSum_3);
		
		}

}
