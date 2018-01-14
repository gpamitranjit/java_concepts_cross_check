package com.amdocs.mainApp_12;

import java.util.stream.Stream;

/**
 * An empty stream has no elements
 * We can use empty() static method of Stream interface to create sequential stream
 * 
 *  
 * @author amit
 *
 */
public class MainApp_12_6 {

	public static void main(String[] args) {
		Stream<String> emptyIntStream = Stream.empty();
		emptyIntStream.forEach(System.out::println);
	}

}
