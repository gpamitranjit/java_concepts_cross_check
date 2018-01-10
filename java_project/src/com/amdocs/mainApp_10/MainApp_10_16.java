package com.amdocs.mainApp_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * use of parallel stream to get random list list every time we process!
 * 
 * @author amit
 *
 */
public class MainApp_10_16 {

	public static void main(String[] args) {
		List<Integer> intStream = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		List<Integer> result = new ArrayList<>();
		
//		Get the Parallel stream from list of integers!
		Stream<Integer> parallelStream = intStream.parallelStream();
		parallelStream.map(intValue -> {
			synchronized(result) {
				if(result.size() < 10) {
					result.add(intValue);
				}
			}
			return intValue;
		}).forEach(tempIntValue -> {});
		
		System.out.println("result list is: " + result);
	}

}
