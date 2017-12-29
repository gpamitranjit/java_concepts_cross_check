package com.amdocs.mainApp_9;

import java.util.ArrayList;
import java.util.List;

import com.amdocs.mainApp_5.Employee;

public class MainApp_9_17 {

	public static void main(String[] args) {
/*Java 8 Stream anyMatch(), allMatch() and nonematch() example
 * Stream.anyMatch(): returns whether any elements of this stream match the provided predicate.
 * this method may not evaluate the predicate on all elements if not necessary for determining result.
 * if the stream is empty then false is returned and the predicate is not evaluated.
 * ----------------------------------------------------------------------------------------------------
 * Stream.allMatch(): returns whether all the elements of this stream match the provided predicate.
 * this method may not evaluate the given predicate on all the elements if not necessary for determining the result.
 * ------------------------------------------------------------------------------------------------------------------
 * Stream.noneMatch(): returns whether no elements of this stream match the provided predicate.
 * ----------------------------------------------------------------------------------------------------------------------
 * 
*/		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Amit", "DSFSDF8989", 67));
		empList.add(new Employee("Ranjit", "SDFSDF23423", 63));
		empList.add(new Employee("Syamala", "SDFSDF23423", 343));
		
		System.out.println("empList data: ");
		empList.stream().forEach(System.out::println);
		
		
		System.out.println("\n\n=======================================================");
//		use of Stream.anyMatch()
		boolean result = empList.stream().anyMatch(emp -> emp.getName().matches("Syamala"));
		System.out.println("\n empList.Stream.anyMatch(emp->emp.getName().matched(\"Syamala\")): " + result );
		
		boolean result_2 = empList.stream().anyMatch(emp -> emp.getName().matches("dummy"));
		System.out.println("\n empList.stream().anyMatch(emp -> emp.getName().matches(\"dummy\")): " + result_2);
		
		System.out.println("=======================================================");
//		use of Stream.allMatch()
		boolean result_3 = empList.stream().allMatch(emp -> emp.getName().matches("Syamala"));
		System.out.println("\n empList.stream().allMatch(emp -> emp.getName().matches(\"Syamala\")): " + result_3);
		
		boolean result_4 = empList.stream().noneMatch(emp -> emp.getName().matches("Syamala"));
		System.out.println("\n empList.stream().noneMatch(emp -> emp.getName().matches(\"Syamala\")): " + result_4);
		
		boolean result_5 = empList.stream().noneMatch(emp -> emp.getName().matches("dummy"));
		System.out.println("\n empList.stream().noneMatch(emp -> emp.getName().matches(\"dummy\")): " + result_5 );
		
	}

}
