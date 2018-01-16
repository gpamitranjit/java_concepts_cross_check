package com.amdocs.mainApp_12;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import com.amdocs.mainApp_12.Employee.Gender;

/**
 * Use of Stream.forEach() and Stream.forEachOrdered() method
 * 
 * 	method signatures are,
 * 		void forEach(Consumer<? super T>  action)
 * 		void forEachOrdered(Consumer<? super T> action)
 * 
 * IntStream, LongStream, DoubleStream contains same methods
 * 
 * The forEach() method doesn't guarantee the order in which the action for each element in the stream is applied.
 * 
 * The forEachOrdered() method performs the action in the order of elements defined by the stream pipeline
 * 
 * WARNIG!, The forEachOrdered() method may slow down the processing in a parallel stream.
 * 
 * WARNING!, When creating the stream from collection any modification the stream data will make changes to the underlying data source!
 * 
 * @author amit
 *
 */
public class MainApp_12_18 {

	public static void main(String[] args) {
		List<Employee> persons = MainApp_12_18.persons();
		System.out.println("Before increasing the income of female employees,");
		persons.stream()
			.filter(e -> e.getGender().equals(Employee.Gender.FEMALE))
			.forEach(System.out::println);
		
		System.out.println("After increasng the income of female employees,");
		persons.stream()
			.filter(e -> e.getGender().equals(Employee.Gender.FEMALE))
			.forEach(e -> e.setIncome(e.getIncome() * 1.10));
		
		System.out.println("Female employees salary increated by 10%: ");
		persons.stream()
			.filter(e -> e.getGender().equals(Employee.Gender.FEMALE))
			.forEach(System.out::println);
	}

	  public static List<Employee> persons() {
		    Employee p1 = new Employee(1, "Jake", Gender.MALE, LocalDate.of(1971,
		        Month.JANUARY, 1), 2343.0);
		    Employee p2 = new Employee(2, "Jack", Gender.MALE, LocalDate.of(1972,
		        Month.JULY, 21), 7100.0);
		    Employee p3 = new Employee(3, "Jane", Gender.FEMALE, LocalDate.of(1973,
		        Month.MAY, 29), 5455.0);
		    Employee p4 = new Employee(4, "Jode", Gender.MALE, LocalDate.of(1974,
		        Month.OCTOBER, 16), 1800.0);
		    Employee p5 = new Employee(5, "Jeny", Gender.FEMALE, LocalDate.of(1975,
		        Month.DECEMBER, 13), 1234.0);
		    Employee p6 = new Employee(6, "Jason", Gender.MALE, LocalDate.of(1976,
		        Month.JUNE, 9), 3211.0);

		    List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

		    return persons;
		  }
}
