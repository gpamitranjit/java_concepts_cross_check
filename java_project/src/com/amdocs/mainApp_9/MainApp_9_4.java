package com.amdocs.mainApp_9;

import java.util.UUID;
import java.util.stream.Stream;

public class MainApp_9_4 {

	public static void main(String[] args) {
		Stream<UUID> uuidStream = Stream.generate(UUID::randomUUID);
		uuidStream.limit(10).forEach(System.out::println);
	}

}
