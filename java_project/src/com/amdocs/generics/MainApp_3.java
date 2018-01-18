package com.amdocs.generics;

/**
 * Creating generic parameterized classes
 * 
 * @author amit
 *
 */

public class MainApp_3 {

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<>();
		Box<String> stringBox = new Box<>();
		
		integerBox.add(12);
		stringBox.add("Amit");
		
		System.out.println("Data from integer box: " + integerBox.get());
		System.out.println("Data from string box: " + stringBox.get());
	}

}
