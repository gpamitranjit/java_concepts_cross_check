package com.amdocs.mainApp_12;

import java.util.regex.Pattern;

/**
 * Creating stream of strings from regular expression processing
 * 
 * @author amit
 *
 */
public class MainApp_12_10 {

	public static void main(String[] args) {
		String str = "java, c++,	c,python";
		Pattern.compile(",\\s*")
		.splitAsStream(str)
		.forEach(System.out::println);
	}

}
