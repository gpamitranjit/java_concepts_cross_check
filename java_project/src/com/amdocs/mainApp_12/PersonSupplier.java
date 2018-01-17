package com.amdocs.mainApp_12;

import java.util.function.Supplier;

public class PersonSupplier{

//	@Override
	public Person get() {
		return new Person("Ranjit", 31, "businessMan");
	}

	public static Person getPerson() {
		return new Person("Hello", 21, "student");
	}
}
