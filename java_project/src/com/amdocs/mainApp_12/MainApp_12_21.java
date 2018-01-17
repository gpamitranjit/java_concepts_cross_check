package com.amdocs.mainApp_12;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

import com.amdocs.mainApp_12.Employee.Gender;

/**
 * use of Stream.collect()
 * 
 * @author amit
 *
 */
public class MainApp_12_21 {

	public static void main(String[] args) {
//		reduce to average object!, 		
		Averager averageCollect = MainApp_12_21.persons()
				.stream()
				.filter(person -> person.getGender().equals(Employee.Gender.MALE))
				.map(Employee::getIncome)
				.collect(Averager::new, Averager::accept, Averager::combine);
		
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
