package com.amdocs.mainApp_7;

public interface FirstInterface {
	default void someMethod() {
		System.out.println("i am default method from interface named: FirstInterface.");
	}
}
