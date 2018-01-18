package com.amdocs.mainApp_12;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.amdocs.mainApp_12.Employee.Gender;

/**
 * ***********Java Stream collector****************
 * 
 * 
 * To group data in a stream we can use collect() method of the Stream<T> interface
 * The collect() method is overloaded with two versions
 * 
 * 	1.<R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
 * 
 * 	2.<R,A> R collect(Collector<?  super T,A,R> collector)
 * 
 * 	The first version of collect method takes 3 arguments:
 * 			1. A supplier that supplies a mutable container to store the results
 * 			2. An accumulator that accumulates the results into the mutable container
 * 			3. A combiner that combines the partial results when used in parallel
 * 
 * We can follow below steps to collect the employee names in an ArrayList<String>
 * 
 * First, create a supplier which returns an ArrayList<String> using either of the following statement to create the supplier:
 * 
 * 	method 1: Supplier<ArrayList<String>> supplier = () -> new ArrayList<>();
 *  method 2: Supplier<ArrayList<String>> supplier = ArrayList::new;
 * 
 * Second, create an accumulator that receives two arguments which is the container returned from supplier(ArrayList<String> in this case) and the element of the stream
 * the Accumulator adds the names to the provided mutable container (in this the ArrayList<String>)
 * 
 * The Combiner is used only in a parallel stream
 * 
 * The following code shows how to use the collect() method to collect the names of all employees in a list. 
 * 
 * @author amit
 *
 */
public class MainApp_12_33 {

	public static void main(String[] args) {
		List<Employee> persons = MainApp_12_33.persons();
		List<String> personNames = persons.stream()
									.map(person -> person.getName())
//									.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);	// or second way by using lambda expression
									.collect(ArrayList::new, (list, person) -> {list.add(person);}, (list1, list2) -> {list1.addAll(list2);});
		System.out.println("returned List of names are,");
		personNames.stream()
			.forEach(System.out::println);
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
