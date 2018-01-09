package com.amdocs.mainApp_10;

import java.util.stream.Stream;

/**
 * @author amit
 *
 */
public class MainApp_10_6 {

	public static void main(String[] args) {
//		use of Stream.iterate() method to generate the stream of data.
		System.out.println("=====================================================");
		Stream<String> stringStream_2 = Stream.iterate("abc", (i) -> i);
		
		stringStream_2.forEach(stringValue -> {
			System.out.println(stringValue);
		});
	}

}
