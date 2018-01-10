package com.amdocs.mainApp_10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Create stream of data from stream of list!,
 * For this we make use of flatMap() method
 * @author amit
 *
 */
public class MainApp_10_13 {

	public static void main(String[] args) {
		Stream<List<String>>	streamOfList = Stream.of(
					Arrays.asList("ranjit", "amit"),
					Arrays.asList("sonu", "preeti"),
					Arrays.asList("baby")
				);
		
		Stream<String> streamOfString = streamOfList.flatMap(strList -> {
											return strList.stream();
										});
		
		System.out.print("final stream of flattered stream: ");
		streamOfString.forEach(stringValue -> {
			System.out.print(stringValue + ", ");
		});
	}

}
