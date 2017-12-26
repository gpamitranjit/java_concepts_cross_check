package com.amdocs.mainApp_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry; 

/**
 * @author Amit
 *
 */
public class MainApp_8_1 {

	public static void main(String[] args) {
//		This Example application will illustrate the use of java 8 foreach default method to iterate over list of data inside the map!
//		the foreach is default method that is added in java 8's Iterable and Stream interface.
//		Hence any class that implements interable interface will inherit the foreach method and hence it will be able to iterate over the elements.
		
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("INDIA", "DEHLI");
		countryMap.put("USA", "WASHINGTON D.C");
		countryMap.put("JAPAN", "TOKYO");
		countryMap.put("CANADA", "OTTAWA");
		
		
		IterateInOldStyle(countryMap);
		IterateMapUsingForeachMethod(countryMap);
	}
	
	public static void IterateInOldStyle(Map<String , String> countryMap) {
		System.out.println("================================================");
		System.out.println("Using old style of iterating over the Map collection data.");
		for(Entry<String, String> entry : countryMap.entrySet()) {
			System.out.println("Entry key: "+ entry.getKey() + ", Entry value: " + entry.getValue());
		}

	}

	public static void IterateMapUsingForeachMethod(Map<String, String> countryMap) {
		System.out.println("==================================================");
		System.out.println("Using foreach method inherited from iterable interface of java 8");
//		Note: we are not using () -> {} format in blow lambada expression as we have only one statement in the processing block.
		countryMap.forEach((key, value) -> System.out.println("Map Key: " + key + ", Map value: " + value));

//		Note: we use () -> {} format of lambda expression if we have more than one statement to process.
		countryMap.forEach((key, value) -> {
//			processing code goes here.
			System.out.println("Map Key: " + key + ", Map value: " + value);
		});
		
	}
//	Important Note: When we have only one statement in lambada exresssion then the statement value becomes the return value of the processing block,
//	if we use () -> {} type of lambada expression for processing the data then explicit return keyword has to use to return the value.
}
