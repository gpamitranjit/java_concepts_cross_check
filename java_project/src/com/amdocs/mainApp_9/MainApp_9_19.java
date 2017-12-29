package com.amdocs.mainApp_9;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class MainApp_9_19 {

	public static void main(String[] args) {
/*	Primitive types in java 8 stream.
 * 	As we know that java collection framework works only with objects!
 * for this we make use of corresponding wrapper objects!
 * 
 * But in Java 8 Streams we don't need to worry about handling such case for primitive types
 * 
 * Java 8 stream APIs provides below interfaces to support primitive types in stream,
 * 
 * 1. IntStream: is a sequence of primitive int-valued elements supporting sequential and parallel aggregation
 * 		this is the int primitive specialization of stream.
 *
 * 2. LongStream: is a sequence of primitive long-valued elements supporting sequential and parallel aggregate operations,
 * 		this is the long primitive specialization of stream.
 * 
 * 3. DoubleStream: is a sequence of double-valued elements supporting sequential and parallel aggregate operations,
 * 		this is a double primitive specialization of stream.
 * 
 * 
*/
		IntStream intStream = IntStream.of(10, 20, 30, 40);
		System.out.println("---------IntStream---------------");
		intStream.forEach(System.out::println);
		
		System.out.println("----------DoubleStream--------------");
		double[] doubleArray = {12.0, 232.9, 343.45, 234.345, 345.34};
		DoubleStream doubleStream = Arrays.stream(doubleArray);
		doubleStream.forEach(System.out::println);
	}

}
