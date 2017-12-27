package com.amdocs.mainApp_9;

import java.util.stream.Stream;

public class MainApp_9_12 {

	public static void main(String[] args) {
/*	Stream.toArray method returns an array containing the elements of this stream.
 * 
		
*/	
		try {
			String[] strArr = (String[]) Stream.of("car", "bus", "train", "flight", "bike").toArray(String[] :: new);
			for(String str : strArr) {
				System.out.println(str);
			}
			
		}catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
