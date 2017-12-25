package com.amdocs.mainApp_6;

import com.amdocs.mainApp_5.Employee;

public class MyExampleComparator {

	public int compare(Employee e1, Employee e2) {
		return e1.getSalary().compareTo(e2.getSalary());
	}
}
