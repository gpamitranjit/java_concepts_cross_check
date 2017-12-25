package com.amdocs.mainApp_6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amit
 *
 */
public class MainApp_6_1 {

	public static void main(String[] args) {
//		showcase of java 8 Method References
//		Basically there are 3 ways with which you can have method reference, they are as follows,
//		1. Reference to Static Method of a class, Syntax: ClassName::staticMethodName
//		2. Reference to Instance Method, Syntax: ObjectName::methodName
//		3. Reference to Constructo, Syntax: ClassName::new

		
//		This sample Example application showcases the first option!
		List<String> countryList = new ArrayList<>();
		countryList.add("INDIA");
		countryList.add("USA");
		countryList.add("JAPAN");
		countryList.add("CANADA");
		
		System.out.println("===============================================");
		System.out.println("Using Old style for printing list of strings.");
		for(String country : countryList) {
			MainApp_6_1.printString(country);
		}
		
		
		System.out.println("===============================================");
		System.out.println("using method reference for calling target method and processing the elements");
		countryList.forEach(MainApp_6_1::printString);
		
		
		System.out.println("================================================");
		System.out.println("Using Lambada expression way of calling target static metohd and processing the elements");
		countryList.forEach((String country) -> {MainApp_6_1.printString(country);});
		
		
	}
	
//	static method to be referenced!
	public static void printString(String str) {
		System.out.println(str);
	}

}
