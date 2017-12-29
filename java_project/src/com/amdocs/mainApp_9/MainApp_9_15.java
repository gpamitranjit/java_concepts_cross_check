package com.amdocs.mainApp_9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.amdocs.mainApp_5.Employee;

public class MainApp_9_15 {

	public static void main(String[] args) {
/*	Stream.collect() method used to receive elements from a stream and store them in a collection
 * 	This example application illustrate the use of Stream.collectI() method!
		
*/	
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Amit", "SDFS87878", 34));
		empList.add(new Employee("Ranjit", "SDFSDFSDF7878", 45));
		empList.add(new Employee("Syamala", "SDKFSLDF7878", 56));
		empList.add(new Employee("Bablu", "SDFSDFJ34354", 12));
		
		List<Employee> filteredList = empList.stream()
											.filter(emp -> emp.getSalary() > 50)
											.collect(Collectors.toList());
		
		filteredList.forEach(System.out::println);
	}

}
