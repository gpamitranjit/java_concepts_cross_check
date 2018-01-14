package com.amdocs.mainApp_12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * walking through directory tree
 * @author amit
 *
 */
public class MainApp_12_8 {

	public static void main(String[] args) {
		Path dir = Paths.get(".");
		System.out.printf("%nThe file tree for %s%n", dir.toAbsolutePath());
		try(Stream<Path> fileTree = Files.walk(dir)) {
			fileTree.forEach(value -> System.out.println(value));
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
