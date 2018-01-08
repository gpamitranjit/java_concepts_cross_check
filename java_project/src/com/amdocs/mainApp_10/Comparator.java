package com.amdocs.mainApp_10;

/**
 * This is a functional interface as it has only one non-Object class method!
 * @author amit
 *
 * @param <T>
 */
public interface Comparator<T> {
	
//	Object class method
	public boolean equals(Object object);
	
//	non-Object class method
	int compare(T obj1, T Obj2);
}
