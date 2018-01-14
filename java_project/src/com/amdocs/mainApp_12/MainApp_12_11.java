package com.amdocs.mainApp_12;

import java.util.Optional;

/**
 * Dealing with NullPointerException!
 * In java 8 Optional<T> class has been introduced to deal with this exception
 * Optional<T> class has three factory methods to create Optional objects
 * 	1. <T> Optional<T> empty()
 * 		--> This returns an empty Optional
 * 		--> The Optional<T> returned from this method doesn't contains any non-null value.
 * 
 *  2. <T> Optional<T> of(value)
 *  	--> This returns an Optional object containing the specified value as the non-null value.
 *  	--> If the specified value is null then it will throw NullPointerException!
 *  
 *  3. <T> Optional<T> ofNullable(T value)
 *  	--> This returns an optional containing the specified value if the value is non-null
 *  	--> If the specified value is null, then it returns an empty optional
 *  
 * @author amit
 *
 */
public class MainApp_12_11 {

	public static void main(String[] args) {
//		following code shows how to create the Optional objects in different ways
		Optional<String> empty = Optional.empty();
		System.out.println("isPresent: " + empty.isPresent());
		System.out.println("empty Optional object: " + empty);
	
		
		System.out.println("========================");
		Optional<String> str = Optional.of("amit.com");
		System.out.println("Optional.of(\"amit.com\"): " + str);
		
//		intentionally passing null to of() method	<-- This will Throw NullPointerException
	
/*		try {
			Optional<String> str_2 = Optional.of(null);

		}catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}*/
		
		String nullableString = "";
		Optional<String> str_3 = Optional.ofNullable(nullableString);
		System.out.println("str_3: " + str_3);
		System.out.println("isPresent: " + str_3.isPresent());
		System.out.println("optional.empty: " + str_3.empty());
		
		
		
		System.out.println("=====================================");
//		The following code prints the value in an optional object if it contains a non-null value
		
		Optional<String> str_4 = Optional.of("amit.com");
		if(str_4.isPresent()) {
			String value = str_4.get();
			System.out.println("Optional contains: " + value);
		}
		else {
			System.out.println("Optional is empty!");
		}
	}

}
