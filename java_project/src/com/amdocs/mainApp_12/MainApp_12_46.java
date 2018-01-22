package com.amdocs.mainApp_12;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.amdocs.mainApp_12.Employee.Gender;

/**
 * The following code group the people by gender, within each gender group and 
 * it creates another group based on the month of their births and lists the names of the people born in this group
 * 
 * @author amit
 *
 */
public class MainApp_12_46 {

	public static void main(String[] args) {
	List<Employee> persons = MainApp_12_46.persons();
	Map<Gender, Map<Month, String>> personsByGenderAndDobMonth = persons
			.stream()
			.collect(Collectors.groupingBy(Employee::getGender,
					Collectors.groupingBy(p -> p.getDob().getMonth(), Collectors.mapping(Employee::getName, Collectors.joining(", ")))));
	System.out.println(personsByGenderAndDobMonth);
	
	}

	public static List<Employee> persons() {
	    Employee p1 = new Employee(1, "Jake", Gender.MALE, LocalDate.of(1971,Month.JANUARY, 1), 2000.0);
	    Employee p2 = new Employee(2, "Jack", Gender.MALE, LocalDate.of(1972,Month.JULY, 21), 3000.0);
	    Employee p3 = new Employee(3, "Jane", Gender.FEMALE, LocalDate.of(1973,Month.MAY, 29), 4000.0);
	    Employee p4 = new Employee(4, "Jode", Gender.MALE, LocalDate.of(1974,Month.OCTOBER, 16), 7000.0);
	    Employee p5 = new Employee(5, "Jake", Gender.FEMALE, LocalDate.of(1975,Month.DECEMBER, 13), 8000.0);
	    Employee p6 = new Employee(6, "Jake", Gender.MALE, LocalDate.of(1976,Month.JUNE, 9), 6000.0);

	    List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

	    return persons;
	}
}
