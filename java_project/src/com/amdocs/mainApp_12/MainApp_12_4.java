package com.amdocs.mainApp_12;

import java.util.stream.Stream;

/**
 * Creating stream of data by using Stream.builder() method,
 * This has advantages over ArrayList as it removes the overhead of copying the data from ArrayList to target stream
 * 
 * i.e We can use Stream.Builder<T> to create streams
 * 
 * @author amit
 *
 */
public class MainApp_12_4 {

	public static void main(String[] args) {
		Stream<String> builderStream = Stream.<String>builder()
											.add("xml")
											.add("Java")
											.add("CSS")
											.add("JPQL")
											.build();
		builderStream.forEach(System.out::println);
	}

}
