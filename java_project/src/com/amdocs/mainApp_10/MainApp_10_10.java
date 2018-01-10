package com.amdocs.mainApp_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * java-8 stream intermediate operations,
 * this example illustrate the use of filter operations of java 8
 * 
 * @author amit
 *
 */
public class MainApp_10_10 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for(int i=0; i < 100; i++) {
			intList.add(i);
		}
		
		Stream<Integer> intStream = intList.stream();
		
//		Create the stream of integer elements which are greater than 90
		Stream<Integer> intStream_2 = intStream.filter(intValue -> intValue > 90);
		intStream_2.forEach((Integer intValue) -> {
//			process each filtered elements!
			System.out.println(intValue);
		});
	}

}
