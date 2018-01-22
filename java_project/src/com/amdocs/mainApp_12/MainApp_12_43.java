package com.amdocs.mainApp_12;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.amdocs.mainApp_12.Employee.Gender;

/**
 * Java Streams Grouping
 * 	--> Grouping the stream of data based on an attribute!
 * 
 * The groupBy() method of Collectors class returns a collector that groups the data before collecting them in map, it's similar to "group by" clause in SQL
 * The groupBy() method is overloaded and it has 3 overloaded version of methods
 * 
 * groupingBy(Function<? super  T,?  extends K>  classifier)
 * groupingBy(Function<? super  T,?  extends K>  classifier,  Collector<? super T,A,D> downstream)
 * groupingBy(Function<? super  T,?  extends K>  classifier, Supplier<M>  mapFactory, Collector<? super T,A,D> downstream)
 * 
 * classifier function generates the keys in target map and collector performs reduction operations on the values associated with each key
 * 
 * The following code shows how to group the people by gender attribute and how to count the number of people in each group
 * 
 * The counting() method of the Collectors class returns a collectors to count the number of elements in a stream
 * 
 * @author amit
 *
 */
public class MainApp_12_43 {

	public static void main(String[] args) {
		List<Employee> persons = MainApp_12_43.persons();
		Map<Employee.Gender, Long> countByGender = persons
				.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(countByGender);
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
