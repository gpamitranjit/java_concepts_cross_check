package com.amdocs.mainApp_12;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *  If we are creating stream of data from collections then we don't need to close the collections after processing the stream
 *  If we are creating stream of data from closable data sources such I/O channels then we can make use of try-with-resources block to get the I/O channel closed automatically otherwise we have to close the I/O  channel explicitly!
 *  	
 *  	**Stream API Architecture
 *  
 *  		AutoClosable
 *  			|
 *  			+---BaseStream
 *  				|
 *  				+---IntStream
 *  				|
 *  				+---LongStream
 *  				|
 *  				+---DoubleStream
 *  				|
 *  				+---Steam<T>
 *  
 *  BaseStream interface defines all methods common to all types of streams!, some of such methods are,
 *  1. Iterator<T> iterator();
 *  	-->this is a terminal operation.
 *  	-->returns an iterator for the stream.
 *  2. sequential();
 *  	-->this is a intermediate operations
 *  	-->returns a sequential stream.
 *  	-->if the source stream is sequential then it will return itself.
 *  	-->it converts parallel stream into sequential stream.
 *  3. parallel();
 *  	-->this is a intermediate operations
 *  	-->returns a parallel stream
 *  	-->if the stream is parallel already then it returns itself
 *  	-->else it will convert the sequential stream into parallel stream.
 *  4. boolean isParallel();
 *  	-->returns true if the stream is parallel otherwise false.
 *  	-->calling this method after terminal operations may yield unpredictable results!
 *  5. unordered();
 *  	-->this is a intermediate operations
 *  	-->returns an unordered version of the steam
 *  	-->if the stream is already unordered, it returns itself.
 *  
 *  **********************************
 *  Stream<T> interface presents a stream of the elements of type T
 *  
 *  The Stream<T> interface contains methods such as filter(), map(), reduce(), collect(), max(), min() etc.
 *  
 *  A Stream<Student> represents a stream of student objects.
 *  
 *  When working with primitive types, we can use three specialized stream interfaces, they are as follows,
 *  	--> IntStream
 *  	-->	LongStream
 *  	-->	DoubleStream
 *  these interfaces provide methods to deal with primitive values.
 *  
 *  For other primitive types such as float, short, byte we can still use the three specialized streams 
 *  
 *  stream() method of Collection interface returns sequential stream, in this we the collection act as data source
 *  Stream<T> filter() uses a Predicate<T> to keep elements if the specified predicate returns true for that element.
 *  Stream<T> map(behavior as argument); this uses a function to map each elements in the stream and create new stream.
 *  reduce(T identity, BinaryOperator<T> accumulator);
 *  	--> reduces the stream of elements to single value
 *  	-->	it takes an initial value and an accumulator that is a BinaryOperator<T> as arguments
 * 
 * @author amit
 *
 */
public class MainApp_12_3 {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		
//		use of filter();
//		The following statement obtains a stream of only integers:
		Predicate<Integer> intPredicate = intValue -> intValue % 2 != 0;
		Stream<Integer> oddNumberStream = intList.stream().filter(intPredicate);
		oddNumberStream.forEach(System.out::println);
		
//		use of map(); and use of reduce();
//		This following statement obtains sum of square of the elements in the stream.
		Function<Integer, Integer> squareFunction = intValue -> intValue * intValue;
		int sum = intList.parallelStream()
					.map(squareFunction)
					.reduce(0, Integer::sum);
		System.out.println("sum of the stream element: " + sum);
		
//		second way of using reduce method with user defined accumulator function as second argument to the reduce method.
		int sum_2 = intList.parallelStream()
						.map(squareFunction)
						.reduce(0, (intValue1, intValue2) -> intValue1 + intValue2);
		System.out.println("sum of the stream of elements: " + sum_2);
		
//		third way of using reduce method with user defined accumulator function as second argument to the reduce method.
		BinaryOperator<Integer> sumBinaryOperator = (intValue1, intValue2) -> intValue1 + intValue2;
		int sum_3 = intList.parallelStream()
						.map(squareFunction)
						.reduce(0, sumBinaryOperator);
		System.out.println("sum of the stream of elements: " + sum_3);
	}

}
