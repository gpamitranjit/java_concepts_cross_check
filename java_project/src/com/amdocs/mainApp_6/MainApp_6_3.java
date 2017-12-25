package com.amdocs.mainApp_6;

import com.amdocs.mainApp_5.Employee;

public class MainApp_6_3 {

	public static void main(String[] args) {
//		This Example Application showcase the constructor reference.
		EmployeeFactory empFactory = Employee::new;
		Employee emp = empFactory.getEmployee("Amit", "FDSFLKJL89989", 56);
		System.out.println(emp);
	}

}
