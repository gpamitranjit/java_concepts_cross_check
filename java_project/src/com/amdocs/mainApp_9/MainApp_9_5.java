package com.amdocs.mainApp_9;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.mainApp_5.Employee;

public class MainApp_9_5 {

	public static void main(String[] args) {
//		This Example application illustrate the use of Stream.filter method to filter only those elements that match the given predicate as parameter to filter method
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Rashim", "SDFSDFJLK", 52));
		empList.add(new Employee("Amit", "JLKSDFJKLL79989", 67));
		empList.add(new Employee("Ranjit", "ASDFJLKSJLF78676", 45));
		empList.add(new Employee("Shymala", "SDFJLSJU8907", 34));
		
		
//		first select only employees whose salary is greater than 50
//		and sort the employees based on their names (ignore case)
//		and print each employee of the stream.
		empList.stream().filter(emp -> emp.getSalary() > 50).sorted((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName())).forEach(emp -> System.out.println(emp));
	}

}
