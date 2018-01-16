package com.amdocs.mainApp_12;

import java.util.stream.IntStream;

/**
 * Use of Stream.preek(Consumer<? super T> action) method, this method is used for debugging the stream of operations,
 * More particularly at each point of stream operations what elements, the new stream contains can be obtained by this method
 * 
 * The IntStream, LongStream, DoubleStream also contains a peek() method that takes a IntConsumer, LongConsumer, DoubleConsumer respectively
 * 
 * We can also use peek() method to log the statements
 * 
 * @author amit
 *
 */
public class MainApp_12_17 {

	public static void main(String[] args) {
//		sum of square of even integers between the range of 1 through 10
		IntStream StreamOfInt =	IntStream.rangeClosed(1, 10);
	int	sum =StreamOfInt.peek(e -> System.out.println("Taking integer: " + e))
			.filter(e -> e % 2 == 0)
			.peek(e -> System.out.println("Filtered Integer: " + e))
			.map(e -> e * e)
			.peek(e -> System.out.println("Mapped Integer: " + e))
			.reduce(0, Integer::sum);
	System.out.println("sum of square of even integers between the range of 1 through 10: " + sum);
	}

}
