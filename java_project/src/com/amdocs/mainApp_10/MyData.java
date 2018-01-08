package com.amdocs.mainApp_10;


/**
 * interface static method are only available to interface methods not to their implementing classes,
 * but one can call interface static method by calling class name with static method name.
 * @author amit
 */
public interface MyData {
	
	default void print(String str) {
		if(!isNull(str)) {
			System.out.println("MyData Print: " + str);
		}
	}
	
	static boolean isNull(String str) {
		System.out.println("Interface Null check.");
		
		return str == null ? true : "".equals(str) ? true : false; 
	}
}
