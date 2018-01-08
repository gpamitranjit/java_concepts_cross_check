package com.amdocs.mainApp_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainApp_10_2 {

	public static void main(String[] args) {
		try {
			List<Integer> numbers = new ArrayList<>();
			for(int i=0; i< 20; i++) {
				numbers.add(i);
			}
			
			numbers.forEach(System.out::println);
			
			long maxOddNumber = getMaxOddNumber(numbers);
			System.out.println("maxOddNumber: " + maxOddNumber);
		}catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	private static long getMaxOddNumber(List<Integer> numbers) {
		return numbers.stream()
				.filter(MainApp_10_2::isOdd)
				.filter(MainApp_10_2::isGreaterThan3)
				.filter(MainApp_10_2::isLessThan11)
				.max(Comparator.naturalOrder())
				.map(i -> i)
				.get()
				.intValue();
				
	}
	
	private static boolean isOdd(int i) {
			return i % 2 != 0;
	}
	
	private static boolean isGreaterThan3(int i) {
		return i > 3;
	}
	
	private static boolean isLessThan11(int i) {
		return i < 11;
	}
}
