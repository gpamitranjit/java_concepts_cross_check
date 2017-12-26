package com.amdocs.mainApp_9;

import java.util.Arrays;
import java.util.List;

public class MainApp_9_6 {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bus", "train", "malgadi", "bike", "bike");
		vehicles.stream().filter(str -> str.length() > 3).map(String::toUpperCase).forEach(System.out::println);
	}

}
