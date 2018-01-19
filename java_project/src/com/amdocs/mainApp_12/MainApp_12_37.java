package com.amdocs.mainApp_12;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

import com.amdocs.mainApp_12.Employee.Gender;

/**
 * The summary statistics classes are designed to be used with streams,
 * They contain combine() method that combines two summary statistics
 * 
 * The following code shows how to compute the summary statistics for the incomes
 * 
 * @author amit
 *
 */
public class MainApp_12_37 {

	public static void main(String[] args) {
		DoubleSummaryStatistics incomeStats = MainApp_12_37.persons()
				.parallelStream()
				.map(Employee::getIncome)
				.collect(DoubleSummaryStatistics::new, DoubleSummaryStatistics::accept, DoubleSummaryStatistics::combine);
				System.out.println(incomeStats);
				
		
				
				
		System.out.println("Using user defined supplier, accumulator, combiner to achieve the same reusult");
		
		Supplier<DoubleSummaryStatistics> mySupplier = () -> {
			return new DoubleSummaryStatistics();
		};
		
		BiConsumer<DoubleSummaryStatistics, Double> myAccumulator = (partialResult, doubleValue) -> {
			partialResult.accept(doubleValue);
		};
		
		BiConsumer<DoubleSummaryStatistics, DoubleSummaryStatistics> myCombiner = (result1, result2) -> {
			result1.combine(result2);
		};
		
		DoubleSummaryStatistics incomeStats_2 = MainApp_12_37.persons()
					.parallelStream()
					.map(Employee::getIncome)
					.collect(mySupplier, myAccumulator, myCombiner);
		
		System.out.println(incomeStats_2);
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
