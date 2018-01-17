package com.amdocs.mainApp_12;

import java.util.function.Consumer;

/**
 * use of Stream consumers!
 * @author amit
 *
 */
public class MainApp_12_23 {

	public static void main(String[] args) {
		Consumer<String> consumer1 = (arg) -> {
			System.out.println(arg + "OK");
		};
		
		consumer1.accept("TestConsumerAccept -");
		System.out.println("========================================");
		Consumer<String> consumer2 = (x) -> {
			System.out.println(x + "OK!!");
		};
		
		consumer1.andThen(consumer2).accept("TestConsumerAfterThen -");
	}

}
