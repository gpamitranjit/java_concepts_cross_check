package com.amdocs.config;

import java.util.Iterator;

/**
 * @author Amit
 *
 * @param <T>
 */
public class MyIterable<T> implements Iterable<T> {

	private  T[] all;
	
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			private int count = 0;
			
			@Override
			public boolean hasNext() {
				return count < all.length;
			}

			@Override
			public T next() {
				System.out.println("Invoking custom iterator's next() method.");
				return all[count++];
			}
			
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public MyIterable(T[] all) {
		super();
		this.all = all;
	}

}
