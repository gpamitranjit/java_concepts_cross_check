package com.amdocs.mainApp_9;

import java.util.stream.Stream;

public class MainApp_9_2 {

	public static void main(String[] args) {
//		using Stream.of method to create the streams on collections or arrays.
//		Stream.of(comma separated values)
		Stream<Integer> intStream = Stream.of(1,2,3,4,5,6,7);
		intStream.forEach(System.out::println);
		
		System.out.println("=============================================================");
//		create the stream using array of elements
		Stream<Integer> intStream2 = Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9,10});
		intStream2.forEach((intvalue) -> {System.out.println(intvalue);});
	}

}
