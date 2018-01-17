package com.amdocs.mainApp_12;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import com.amdocs.mainApp_12.Employee.Gender;

/**
 * This example application showcases the used examples of reduce() method of stream API
 * 
 * 
 * @author amit
 *
 */
public class MainApp_12_22 {

	public static void main(String[] args) {
//		first used sample case
//		Stream.reduce(seed, accumulator) here seed is acting initial value of the reduction operation
//		when we have empty stream on hand the seed will the result of reduction operation.
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		int sum = intList.stream()
					.reduce(0, Integer::sum);
		System.out.println("sum of elements is: " + sum);
		
//		second used sample case
		List<Employee> persons  = MainApp_12_22.persons();
		double totalSalary = persons.stream()
								.map(e -> e.getIncome())
								.reduce(0.0, Double::sum);
		System.out.println("sum of all the employees income is: " + totalSalary);
		
		
		
	}
	
	  public static List<Employee> persons() {
		    Employee p1 = new Employee(1, "Jake", Gender.MALE, LocalDate.of(1971,
		        Month.JANUARY, 1), 2000.0);
		    Employee p2 = new Employee(2, "Jack", Gender.MALE, LocalDate.of(1972,
		        Month.JULY, 21), 3000.0);
		    
		    Employee p3 = new Employee(3, "Jane", Gender.FEMALE, LocalDate.of(1973,
		        Month.MAY, 29), 4000.0);
		    Employee p4 = new Employee(4, "Jode", Gender.MALE, LocalDate.of(1974,
		        Month.OCTOBER, 16), 7000.0);
		    Employee p5 = new Employee(5, "Jeny", Gender.FEMALE, LocalDate.of(1975,
		        Month.DECEMBER, 13), 8000.0);
		    Employee p6 = new Employee(6, "Jason", Gender.MALE, LocalDate.of(1976,
		        Month.JUNE, 9), 6000.0);

		    List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

		    return persons;
		  }

}
