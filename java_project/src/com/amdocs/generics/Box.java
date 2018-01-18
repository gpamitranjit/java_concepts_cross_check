package com.amdocs.generics;

/**
 * @author amit
 *
 * @param <T>
 */
public class Box<T> {
	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
