package com.amdocs.mainApp_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.amdocs.mainApp_5.Employee;

public class MainApp_9_18 {

	public static void main(String[] args) {
/*	Java 8 Stream.findFirst() and Stream.findAny() method illustration.
 * 
*/	
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Amit", "DSFSDF8989", 67));
		empList.add(new Employee("Ranjit", "SDFSDF23423", 63));
		empList.add(new Employee("Syamala", "SDFSDF23423", 343));
	
//		using ifPresent to avoid returning empty data.
		empList.stream()
				.filter(emp -> emp.getName().matches("Syamala"))
				.findFirst()
				.ifPresent(System.out::println);
		
//		
		Optional<Employee> optionalEmployee = empList.stream()
												.filter(emp -> emp.getName().matches("dummy"))
												.findFirst();
		System.out.println("optionalEmployee:  " + optionalEmployee.toString());
		
		
//		use of Stream.findAny() method
//		unlike findFirst() the findAny() method select any element of the stream in parallel stream,
//		to increase the performance of the application,
//		The cost of invoking multiple invocation on same source of data may not return same result!
//		hence try to use the findFirst() instread.
		empList.stream()
			.filter(emp -> emp.getName().matches("Syamala"))
			.findAny()
			.ifPresent(System.out::println);

		
		
	}

}
