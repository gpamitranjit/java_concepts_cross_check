package com.amdocs.mainApp_7;

public class MainApp_7_1 implements FirstInterface{

	public static void main(String[] args) {
//		The Implemented interface (i.e FirstInterface) contains default method which contains implementations.
//		calling default method of implemented interface (i.e FirstInterface)
		
		
//		Advantages of default methods being in interface are as follows,
//		1. Suppose one or more mehtods are being implemented by multiple classes with same implementation then in such situations we can provide the default method in interface with the implementtation.
//		2. Say for the new requirement we have to add a new method in the implemented interface that has to be made available to some of the implementing classes but should be enforced by all the implementing classes!

		new MainApp_7_1().someMethod();
	}

}
