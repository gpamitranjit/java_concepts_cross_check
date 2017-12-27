package com.amdocs.mainApp_9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp_9_8 {

	public static void main(String[] args) {
//		Stream.peek method is used to support debugging,
//		This method is used to see the elements as they flow past certain point in pipeline!
//		Additionally performing provided action on each element as elements are consumed by the final stream.
		List<String> newStream = Stream.of("bus", "car", "bcycle", "flight", "train")
			  .filter(e -> e.length() > 3)
//			  .peek(e -> System.out.println("Filtered Value: " + e))	//This helps in knowing all the elements in current stream.
			  .filter(e -> e.length() > 5)
			  .map(String::toUpperCase)
			  .peek(e -> System.out.println("Mapped value: " + e))		//This helps in knowing all the elements in current stream.
			  .collect(Collectors.toList());
		
		
		System.out.println("===============================================");
		System.out.println("Resulting stream is");
		newStream.forEach(System.out::println);
		
	}

}
