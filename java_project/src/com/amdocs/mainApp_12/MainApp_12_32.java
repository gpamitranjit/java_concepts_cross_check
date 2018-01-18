package com.amdocs.mainApp_12;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import com.amdocs.mainApp_12.Employee.Gender;

/**
 * the following code uses map() method count the elements in the stream 
 * 
 * @author amit
 *
 */
public class MainApp_12_32 {

	public static void main(String[] args) {
		List<Employee> persons = MainApp_12_32.persons();
		long totalPersons = persons.stream()
								.map(person -> 1L)
								.count();
		System.out.println("total persons are: " + totalPersons);
		
//		another way of counting the number of elements in the stream of data
		long totalCount = persons.stream()
			.map(person -> 1L)
			.reduce(0L, Long::sum);
		System.out.println("total person are: " + totalCount);
		
		
//		another way of counting the total elements in the stream
		long totalCount_3 = persons.parallelStream()
				.reduce(0L , (partialResult, person)-> partialResult + 1L, Long::sum);
		System.out.println("total person are: " + totalCount_3);
	}
	
	public static List<Employee> persons() {
	    Employee p1 = new Employee(1, "Jake", Gender.MALE, LocalDate.of(1971,Month.JANUARY, 1), 2000.0);
	    Employee p2 = new Employee(2, "Jack", Gender.MALE, LocalDate.of(1972,Month.JULY, 21), 3000.0);
	    Employee p3 = new Employee(3, "Jane", Gender.FEMALE, LocalDate.of(1973,Month.MAY, 29), 4000.0);
	    Employee p4 = new Employee(4, "Jode", Gender.MALE, LocalDate.of(1974,Month.OCTOBER, 16), 7000.0);
	    Employee p5 = new Employee(5, "Jeny", Gender.FEMALE, LocalDate.of(1975,Month.DECEMBER, 13), 8000.0);
	    Employee p6 = new Employee(6, "Jason", Gender.MALE, LocalDate.of(1976,Month.JUNE, 9), 6000.0);

	    List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

	    return persons;
	}

}
