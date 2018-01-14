package com.amdocs.mainApp_12;

/**
 * Creating Stream of characters from string then applying varies filters
 * @author amit
 *
 */
public class MainApp_12_9 {

	public static void main(String[] args) {
		String str = "5 123,123,qwe,1,123,    25";
		str.chars()
		.filter(myChar -> !Character.isDigit(myChar) && !Character.isWhitespace(myChar))
		.forEach(myChar -> System.out.printf("%c", myChar));
	}

}
