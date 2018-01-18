package com.amdocs.mainApp_12;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

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
		
//		this biConsumer will be used only when we operate on the parallel stream,
//		i.e it will combine the result container from all the independant streams into one result container after the other.
		
		BiConsumer<Averager, Averager> biConsumer_1 = (averager1, averager2) -> {
			averager1.setTotal(averager1.getTotal() + averager2.getTotal());
			averager1.setCount(averager1.getCount() + averager2.getCount());
		};
		
//		this biConsumer will be used irrespective of the type of produced stream(i.e either sequential or parallel stream.)
//		it will add next value into previous result container, in this case result container is first argument.
		BiConsumer<Averager, Double> biConsumer_2 = (averagerValue, doubleValue) -> {
			
			averagerValue.setTotal(averagerValue.getTotal() + doubleValue);
			averagerValue.setCount(averagerValue.getCount() + 1);
			
		};
		
		Supplier<Averager> averagerSupplier = () ->  {
			return new Averager();
		};
		
//		in-case of sequential stream the combiner biConsumer will be ignored!		
		Averager averageCollect = MainApp_12_21.persons()
				.parallelStream()
				.filter(person -> person.getGender().equals(Employee.Gender.MALE))
				.map(Employee::getIncome)
				.collect(averagerSupplier, biConsumer_2, biConsumer_1);
		System.out.println("returned averager object contains: total=" + averageCollect.getTotal() + ", count=" + averageCollect.getCount());
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
