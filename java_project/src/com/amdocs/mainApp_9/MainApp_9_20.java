package com.amdocs.mainApp_9;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class MainApp_9_20 {

	public static void main(String[] args) {
/*	Java 8 Functional Interface!
 * 	An interface with exactly one method in it is called as functional interface.
 * 	@FunctionalInterface annotation is introduced so as to mark the interface as special interface for compiler (funcational interface)
 * 	
 * if an interface is annotated with @FuncationalInterface and if we try to declare more than one abstract method then compiler will throw error!
 * 
 * The major benefit of using java 8 functional interface is that we can use Lambada expression to instantiate them and avoid using bulky anonymous class implementation
 * java 8 has defined lot of functional interface,
 * some  of the functional interface from java.util.funcation package are Consumer, Supplier, Function and Predicate
 * 
 * 
 * with java language we can't use functions without java classes or objects!
 * 
 * that's why java has made use of lambda exression for executing funcational methods as we know that funcational interface contains only one funcation hence we don't have any confusion in applying that in lambada exression
 * 
 * 
 * Now let's see how we can use Runnable anonymous using lambada expression
 * 
 * 
 * Benefits of using Lambada Expression are,
 * 1. one of the clear benefit of using lambada exression is the amount of reduced code.
 * 		we have already seen how easily we can create an instance of functional interface using lambada exression.
 * 2. Another benefit of using lambada exression is that we can benefit from stream API's sequential and parallel operation support!
 * 	
*/		
//		instancaite the Runnable interface using lambada exression.
		Runnable runnable = () -> System.out.println("from run() of thread!");
		runnable.run();
		
//		test if the number is prime number or not!
		
//		first using traditional way
//		with this traditional way you can see we have so many exit doors!
		boolean isPrimeOldway = isPrimeOldWay(19);
		System.out.println("given number is prime: " + isPrimeOldway);
		
		
//		using lambada exression way to check if the given number is prime number
		boolean isPrimeLambadaExression = isPrimeLambadaExresssion(19);
		System.out.println("given number is prime: " + isPrimeLambadaExression);

	}
	
	private static boolean isPrimeOldWay(int number) {
		
		if(number < 2) return false;				//exit door
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) return false;		// exit door
		}
		return true;								//exit door
	}
	
	private static boolean isPrimeLambadaExresssion(int number) {
//		the Instream.range() method returns primitive int-valued elements,
//		that are sequential ordered elements.
//		range(start, end) method return range of int elements starting from "start" and end with "end-1" of elements
		return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index ==0);
	}
	
//	more readable way of writing lambada expressions
	@SuppressWarnings("unused")
	private static boolean isPrimeLambadaExressionVersion_2(int number) {
		IntPredicate intPredicate = (int index) -> { return number % index == 0;};
		
		return number > 1 && IntStream.range(0, number).noneMatch(intPredicate);
		
	}

}
