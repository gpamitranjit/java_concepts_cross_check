package com.amdocs.generics;

import java.util.Arrays;
import java.util.List;

/**
 * @author amit
 *
 */
public class MainApp_1 {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		List<String> stringList = Arrays.asList("amit", "ranjit", "smita");
		
		System.out.println("print array of integer list,");
		printElements(intList);
		
		System.out.println("print array of string list,");
		printElements(stringList);
	}
	
	public static <E> void printElements(List<E> elements) {
		for(E element : elements) {
			System.out.println(element);
		}
	}

}
