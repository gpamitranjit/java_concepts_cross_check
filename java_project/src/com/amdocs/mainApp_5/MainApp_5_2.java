package com.amdocs.mainApp_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Amit
 *
 */
public class MainApp_5_2 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Vishal", "SKDJFLSJF89899", 12));
		empList.add(new Employee("Amit", "SDFLDSFJL8989", 23));
		empList.add(new Employee("Ranjit", "SKDJFLK8989", 24));
		empList.add(new Employee("Shyamala", "LKSDJLF899", 20));
		

//		As we know that each Lambada exression returns the Functinal Interface
//		and intern funcational interfaces are the subtype of Object supercalss!
		
//		lambada expression returning the object
		Comparator<Employee> comparatorASC = (Employee e1, Employee e2) -> e1.getSalary().compareTo(e2.getSalary());
		System.out.println("======================================================");
		System.out.println("Sorting the employee elements in Ascending order based on salary of the employee.");

//		using the returned comparator object from Lambada exression.
		Collections.sort(empList, comparatorASC);
		empList.forEach((Employee emp) -> {System.out.println(emp);});
		
		
//		lambada exression returning the object
		Comparator<Employee> comparatorDESC = (Employee e1, Employee e2) -> e2.getSalary().compareTo(e1.getSalary());
		
		System.out.println("======================================================");
		System.out.println("Sorting the employees elements in Descending order based of their salary.");

//		using the returned comparator object from Lambada exression.
		Collections.sort(empList, comparatorDESC);
		empList.forEach((Employee emp) -> {System.out.println(emp);});
		
		
		
	}

}
