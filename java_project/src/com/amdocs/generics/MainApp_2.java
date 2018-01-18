package com.amdocs.generics;

/**
 * @author amit
 *
 */
public class MainApp_2 {

	public static void main(String[] args) {
		
		System.out.printf("Max of %d, %d, %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
		
		System.out.printf("Max of %.1f, %.1f, %.1f is %.1f\n\n", 3.343, 4.4545, 5.4545, maximum(3.343, 4.4545, 5.4545));
	}
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max =z;
		}
		
		return max;
	}

}
