package com.amdocs.mainApp_12;

import java.util.function.BinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * in this sample application we will illustrate the use of IntStream.iterate() method of Stream API
 * 
 * @author amit
 *
 */
public class MainApp_12_13 {

	public static void main(String[] args) {
//		Here first argument will be acting as seed (i.e initial value of the iteration)
//		And to produce the subsequent elements of the stream we make use of IntUnaryOperator (i.e we form this IntUnaryOperator by using Lambada expression)
		
		IntStream intStream =IntStream.iterate(10, i -> i +1);
		intStream.limit(10)
			.forEach(System.out::println);
		
		System.out.println("Another way of using IntStream.iterate()");
//		Another way of using IntStream.iterate() method by explicitly defining the IntUnaryOperator
		IntUnaryOperator intUnaryOperator = i -> i + 1;
		IntStream.iterate(10, intUnaryOperator)
			.limit(10)
			.forEach(System.out::println);
		
		
		System.out.println("Using tranditional way of creating the Anonymous object for IntUniaryOperator class rather than using Lambada expression!");
//		Another way of using IntStrream.iterate() method by creating IntUnaryOperator in a traditional way (i.e by creating anonymous object which adds unnecessary verbosity to the program)! 
		IntUnaryOperator intUnaryOperator_2 = new IntUnaryOperator() {
			
			@Override
			public int applyAsInt(int i) {
				return i + 1;
			}
		};
		
		IntStream.iterate(10, intUnaryOperator_2)
			.limit(10)
			.forEach(System.out::println);
		
	}

}
