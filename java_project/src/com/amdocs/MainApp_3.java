package com.amdocs;

import java.util.function.BinaryOperator;

/**
 * @author Amit
 *
 */
public class MainApp_3 {

	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		int sum = calculate(i, j, (a, b) -> {return a + b;});
		System.out.println("sum: " + sum);
		
		int sub = calculate(i, j, (a, b) ->{return a-b;});
		System.out.println("sub: " + sub);
	}

	public static int calculate(int i, int j, BinaryOperator<Integer> bo) {
		return bo.apply(i, j);
	}
}
