package com.amdocs.mainApp_12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * the stream.map() operation creates one-to-one mapping
 * 
 * whereas Stream.flatMap() support one-to-many mapping,
 * 
 *It maps each element of the stream to new stream and then flatten the stream of streams to a final stream 
 *
 * @author amit
 *
 */
public class MainApp_12_19 {

	public static void main(String[] args) {
//		below code creates the first stream containing 1 to 5 elements
//		and then flatMap() operations will create new stream for each element of the former stream and then combine the result as new stream singal stream.
		IntStream.rangeClosed(1, 5)
			.flatMap(element -> IntStream.rangeClosed(element, element+1))
			.forEach(System.out::println);
		
		
		System.out.println("=====================================================");
//		Another use case of flatMap(), that converts the stream of strings to stream of characters
//		first of all the map() method converts Stream<String> to Stream<Stream<IntStream>
//		finally flatMap() maps Stream<IntStream> to Stream<Stream<Character>>,
//		and finally flattens it to produce a Stream<Character>
		Stream.of("java-lang", "c-lang", "c++-lang")
			.map(value -> value.chars())
			.flatMap(intStream -> intStream.mapToObj(n -> (char)n))
			.forEach(System.out::println);
		
		
		System.out.println("================================================");
//		Another Great example of flatMap()
		Stream.of("java", "clang", "c++lang")
		.flatMap(stringValue -> IntStream.range(0, stringValue.length()).mapToObj(stringValue::charAt))
		.forEach(e -> System.out.println(e));
			
	}

}
