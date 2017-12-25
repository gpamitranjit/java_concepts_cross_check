package com.amdocs.mainApp_7;

/**
 * @author Amit
 *
 */
public class MainApp_7_3 implements FirstInterface, ThirdInterface {

	public static void main(String[] args) {
//		in multiple inheritance, if more than one interface contains the same default method then the implementing class should override that common default method to resolve the problem.
		
		new MainApp_7_3().someMethod();
	}

	@Override
	public void someMethod() {
//		FirstInterface.super.someMethod();
//		ThirdInterface.super.someMethod();
		System.out.println("hello from implementing class");
	}

}
