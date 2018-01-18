package com.amdocs.mainApp_12;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

import com.amdocs.mainApp_12.Employee.Gender;

/**
 * this example application illustrate the use of reduce(Accumulator) i.e reduce(BinaryOperator<T>)
 * 
 * @author amit
 *
 */
public class MainApp_12_28 {

	public static void main(String[] args) {
		List<Employee> persons = MainApp_12_28.persons();
//		retrieve the person object whose pay is highest among the list of employees
		Predicate<Employee> personPredicate = (personObj) -> {
			if(personObj.getGender().equals(Employee.Gender.MALE)) {
				return true;
			}
			else 
				return false;
		};
		
//		Employee personObject = new Employee(0, "", Gender.MALE, LocalDate.of(1991, Month.JANUARY, 1), 690.0);
		
		BinaryOperator<Employee> binaryOperator = (person1, person2) -> {
			Employee personObject = null;
			
			if(person1.getIncome() > person2.getIncome()) {
				personObject = person1;
			}
			else
				personObject = person2;
			return personObject;
		};
		
		Optional<Employee> personObj = persons
							.stream()	//or you can use parallelStream() here which will be more efficient when we have huge amount of data to be processed
							.filter(personPredicate)
							.reduce(binaryOperator);
		System.out.println("person with highest pay: " + personObj);
			
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
