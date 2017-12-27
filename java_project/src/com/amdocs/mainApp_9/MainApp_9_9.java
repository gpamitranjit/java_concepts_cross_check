package com.amdocs.mainApp_9;

import java.util.Arrays;
import java.util.List;

public class MainApp_9_9 {

	public static void main(String[] args) {
/* 	Stream APIS' can be ordered or Unordered!
 * An ordered stream keep the order of it's elements.
 * 
 * The Stream API can convert an ordered stream, which may represent an ordered data source such as a list or an ordered set, into an unordered stream.
 * 
 * We can also convert an unordered stream into ordered stream by applying a sorting intermediate operation.
 * 
 * 
 * Below sample application showcase the convertion of unordered stream into ordered stream. 

*/	
		
		List<Integer> intList = Arrays.asList(3,7,9,3,1,2,1, 2, 3, 4, 5);
		
		intList.stream()
				.filter(intValue -> intValue % 2 == 1)
				.sorted()
				.forEach(System.out::println);
	}

}
