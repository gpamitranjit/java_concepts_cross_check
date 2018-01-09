package com.amdocs.mainApp_10;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Converting stream of data into collection or Array of data.
 * Use of Stream API is very powerful and has implicit normal requirement hidden such when collecting the list of data either seqentially or parallelly we don't need to take care of either synchronization over concurrent thead access or merging of stream of data when processing in parallel because they are handled by stream API in isolation
 * @author amit
 *
 */
public class MainApp_10_8 {

	public static void main(String[] args) {
//		Example to collect the stream of integer data as list of data!
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
		List<Integer> intList = intStream.collect(Collectors.toList());
		System.out.println("created list of data is: " + intList);
		
		
//		Example to collect the stream of integer data as map of data!
//			Creating the stream of data as it's already been closed
		Stream<Integer> intStream_2 = Stream.of(1, 2, 3, 4, 5);
		Map<Integer, Integer> intMap = intStream_2.collect(Collectors.toMap(i -> i, i -> i*10));
		Set<Entry<Integer, Integer>> entrySet = intMap.entrySet();
		Stream<Entry<Integer, Integer>> entryStream = entrySet.stream();
		System.out.println("Map data is:");
		entryStream.forEach(entry ->  {
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		});
	}

}
