package com.amdocs.mainApp_7;

public interface ThirdInterface {
	default void someMethod() {
		System.out.println("i am defalt method from interface named: ThirdInterface");
	}
}
