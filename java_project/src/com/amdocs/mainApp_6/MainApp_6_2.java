package com.amdocs.mainApp_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.amdocs.mainApp_5.Employee;

/**
 * @author Amit
 *
 */
public class MainApp_6_2 {

	public static void main(String[] args) {
//	 	This example application showcase the use of method references on instance method!
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Vishal", "SDFLSJ8989", 23));
		empList.add(new Employee("Amit", "ASDFSDJ898", 34));
		empList.add(new Employee("Ranjit", "FSLDJFLJL98989", 56));
		empList.add(new Employee("Shymala", "FSDJFSDF798798", 33));
		
//		instantiating custom comparator!
		MyExampleComparator customComparator = new MyExampleComparator();
		
		System.out.println("===================================================");
		System.out.println("Using the Method reference way to reference instance methods and process the list elements.");
		Collections.sort(empList, customComparator::compare);
		empList.forEach(System.out::println);
		
		
		System.out.println("====================================================");
		System.out.println("Using Lambada expression way to reference the instance method and allow for processing the list elements.");
		Collections.sort(empList,(Employee e1, Employee e2) -> {return customComparator.compare(e1, e2);});
		empList.forEach(System.out::println);
	}

}
