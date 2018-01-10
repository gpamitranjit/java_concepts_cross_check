package com.amdocs.mainApp_10;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * use of java 8 count(), forEach(), anyMatch(), allMatch(), noneMatch() and findFirst() terminal operations
 * @author amit
 *
 */
public class MainApp_10_15 {

	public static void main(String[] args) {
//		use of count() method of stream API
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
		System.out.println("total number of eelments: " + intStream.count());
		
		
//		use of forEach() method of stream API
		System.out.print("printing all the elements with forEach() method java-8: ");
		Stream<Integer> intStream_2  = Stream.of(1, 2, 3, 4, 5);
		intStream_2.forEach(intValue -> System.out.print(intValue + ", "));
		
//		use of anyMatch() method of stream API
		Stream<Integer> intStream_3 = Stream.of(1, 2, 3, 4, 5);
		boolean booleanValue = intStream_3.anyMatch(intValue -> intValue == 4);
		System.out.println("\nis Stream of int data contains digit 4?: " + booleanValue);
		
//		use of allMatch() method of stream API
		Stream<Integer> intStream_4 = Stream.of(1, 2, 3, 4, 5);
		boolean booleanValue_2 = intStream_4.allMatch(intValue -> intValue < 10);
		System.out.println("are all elements of the stream less than 10: " + booleanValue_2);
		
//		use of noneMatch() method of stream API
		Stream<Integer> intStream_5 = Stream.of(1, 2, 3, 4, 5);
		boolean booleanValue_3 = intStream_5.noneMatch(intValue -> intValue == 10);
		System.out.println("stream doesn't contains digit 10?: " + booleanValue_3);
	
//		use of findFirst() method of stream API
//		this is a short circuiting terminal operations
//		retrieve first string which starts with letter "s"
		Stream<String> intStream_6 = Stream.of("ranjit", "smita", "sonu", "amit", "preeti");
		Optional<String> searchedString = intStream_6.filter(intValue -> intValue.startsWith("s"))
												.findFirst();
		if(searchedString.isPresent()) {
		System.out.println("First name sarting with letter s is: " + searchedString.get());
		}
		else {
			System.out.println("No string exist whose first letter starts with s!");
		}
		
		
		
	}

}
