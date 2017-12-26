package com.amdocs.mainApp_8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amit
 *
 */
public class MainApp_8_2 {

	public static void main(String[] args) {
//		This example application illustrates the use of foreach default method of iterable interface,
//		(actually the foreach default method contains in Iterable and Stream interface)
		
		List<String> countryList = new ArrayList<>();
		countryList.add("INDIA");
		countryList.add("USA");
		countryList.add("JAPAN");
		
		iterateOverUsingOldStyle(countryList);
		iterateOverUsingLambadaExpressionStyle(countryList);
		
	}
	
	public static void iterateOverUsingOldStyle(List<String> countryList) {
		System.out.println("==============================================");
		System.out.println("Using old style of Iterating over the List of data.");
		for(String country : countryList) {
			System.out.println(country);
		}
	}
	
	public static void iterateOverUsingLambadaExpressionStyle(List<String> countryList) {
		System.out.println("================================================");
		System.out.println("Using Lambada expression's foreach method to iterate over the list of data.");
		countryList.forEach((country) -> System.out.println(country));
	}
}
