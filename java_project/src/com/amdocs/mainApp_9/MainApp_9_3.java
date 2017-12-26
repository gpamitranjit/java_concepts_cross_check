package com.amdocs.mainApp_9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainApp_9_3 {

	public static void main(String[] args) {
		try {
			List<String> vehicles = Arrays.asList("bus", "car", "train", "flight", "bicycle");
			Stream<String> vehiclesStream = vehicles.stream();
//			vehicles.add("mybike");			With this statement system will throw java.lang.UnsupportedOperationException exception
			vehiclesStream.filter((vehicle) -> { return vehicle.length() > 3;}).forEach((vehicle) -> {System.out.println(vehicle);});
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace(System.err);
		}
	}

}
