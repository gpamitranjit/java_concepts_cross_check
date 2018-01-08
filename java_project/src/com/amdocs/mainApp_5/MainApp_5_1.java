package com.amdocs.mainApp_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Amit
 *
 */
public class MainApp_5_1 {

/*
	java 8 Lambada Exressions are the way to pass functionality to the called method
	and we just tell the called method to make use of this functionality to complete the processing on the passed data.

 * below are the Advantages of using Lambada expressions
 * 1. Reduced Line of code
 * 2. Sequential and Parallel Execution Support
 * 3. Passing behavior to methods
 * 4. High Efficiency with Laziness
 * 
*/	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Vishal", "DFSDJ89898SDFS", 12));
		empList.add(new Employee("Amit", "SLFSDFS23423", 2));
		empList.add(new Employee("Ranjit", "SDJFLSJLDF8989", 23));
		empList.add(new Employee("Shymala", "SDJFLSJL8989", 34));
		
		
		SortUsingOldStyle(empList);
		SortUsingLambdaStyle(empList);
	}

	
	public static void SortUsingOldStyle(List<Employee> empList) {
		System.out.println("===========================================================");
		Collections.sort(empList, new Comparator<Employee>() {
		
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
		});
		
		System.out.println("sorting the employe list based on their salary using old style of inner class implementation.");
		empList.forEach((Employee emp) -> {System.out.println(emp);});
	}
	
	public static void SortUsingLambdaStyle(List<Employee> empList) {
		System.out.println("===========================================================");
		System.out.println("Sorting the employees list based on thier salary in ascending order using Lambada style.");
		Collections.sort(empList, (Employee e1, Employee e2) -> e1.getSalary().compareTo(e2.getSalary()));
		empList.forEach((Employee emp) -> System.out.println(emp));
		
		
		System.out.println("Sorting the employees list based on thier salary in descending order using Lambada style.");
		Collections.sort(empList, (e1, e2) -> {return e2.getSalary().compareTo(e1.getSalary());});
		empList.forEach((Employee emp) -> System.out.println(emp));
	}
}
