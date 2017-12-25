package com.amdocs.mainApp_7;

public class MainApp_7_2 implements FirstInterface, SecondInterface {

//	When a class implements one interface which contains default method and another interface with abstract method,
//	then the implementing class either has to implement the abstract method or override the default method provided by the first interface
	
	public static void main(String[] args) {
		new MainApp_7_2().someMethod();
	}

	@Override
	public void someMethod() {
		System.out.println("implementing the someMethod of SecondInterface so as to resolve the problem.");
	}

}
