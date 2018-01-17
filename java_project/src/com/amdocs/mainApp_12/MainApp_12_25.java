package com.amdocs.mainApp_12;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * this sample application demonstrate the use case of supplier in java 8
 * @author amit
 *
 */
public class MainApp_12_25 {

	public static void main(String[] args) {
		Supplier<Person> personSupplier = () -> {
			return new Person("Amit", 26, "programmer");
		};
		
		Person personObject = personSupplier.get();
		System.out.println("personObect from personSupplier: " + personObject);
		
		System.out.println("========================");
//		using personSupplier again in generate method
		Stream.generate(personSupplier)
			.limit(4)
			.forEach(System.out::println);
		
		
		
		
		
		System.out.println("=========================");
		Stream.generate(PersonSupplier::getPerson)
			.limit(3)
			.forEach(personSupplier_2 -> {System.out.println(personSupplier_2);});
	}
	
	public static Person maker(Supplier<Person> supplier) {
		return supplier.get();
	}

}
