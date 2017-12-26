package com.amdocs.mainApp_9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class MainApp_9_7 {

	public static void main(String[] args) {
//		Use of flatmap to aggregate multiple stream to produce single result!
//		in this example application file named someFile.txt will be acting as source of data!
//		each line each considered as separate stream
//		each word within each line will be considered as stream
//		then we apply distinct() method on these set of stream to retrieve different words
//		finally we apply count() method to obtain the count of the final stream.
		
		try {
			String projectPath = System.getProperty("user.dir");
			long noOfWords = Files.lines(Paths.get(projectPath + "\\src\\com\\amdocs\\mainapp_9\\dummyFile.txt"))
								  .flatMap(line -> Arrays.stream(line.split(" ")))
								  .distinct()
								  .count();
			
			System.out.println("Number of distinct words in file are: " + noOfWords);
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
