package com.amdocs.mainApp_12;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.amdocs.mainApp_12.Employee.Gender;

/**
 * We can collect data from a stream to a map
 * The toMap() overloaded in three versions method of the Collectors class returns a collector to collect data in a map
 * 
 * toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper)
 * toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction)
 * toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M>  mapSupplier)
 * 
 * The first version takes two arguments. both are are function
 * 		--> the first argument maps the stream elements to keys in the map
 * 		--> the second argument maps the stream elements to values in the map
 * if duplicate values are found, an IllegalStateException is thrown
 * 
 * 
 * The following code collects the stream of employee data into Map<Long, String> whose keys are the employee's Id and values are employee's values
 * 
 * @author amit
 *
 */
public class MainApp_12_39 {

	public static void main(String[] args) {
//		guarding the code against IllegalStateException!, this occurs when we have more than one stream object whose target map key is repeated
		try {
			List<Employee> persons = MainApp_12_39.persons();
			Map<Long, String> idToNameMap = persons.stream()
					.collect(Collectors.toMap(Employee::getId, Employee::getName));
			System.out.println("idToNameMap: "+ idToNameMap);
		}
		catch(Exception e) {
			System.out.println("Exception: " +  e.getMessage());
			e.printStackTrace();
		}
		
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
