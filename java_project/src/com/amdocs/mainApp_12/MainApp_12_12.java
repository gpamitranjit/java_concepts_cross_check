package com.amdocs.mainApp_12;

import java.util.OptionalInt;

/**
 * OptionalInt, OptionalLong, OptionalDouble are the specialized classes for dealing with optional values of specific primitive values
 * 
 * @author amit
 *
 */
public class MainApp_12_12 {

	public static void main(String[] args) {
		OptionalInt intOptional = OptionalInt.of(2);
		
		if(intOptional.isPresent()) {
			int value = intOptional.getAsInt();
			System.out.println("intOptional value is: " + value);
		}
		else {
			System.out.println("value is absent!");
		}
	}

}
