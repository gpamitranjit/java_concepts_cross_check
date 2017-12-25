package com.amdocs;

/**
 * @author Amit
 *
 */
public class MainApp_4 {

	public static void main(String[] args) {
		Runnable runnableImpl1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run method of runnable Impl called.");
			}
		};
		
		Runnable runnableImpl2 = () -> {System.out.println("run method of runnable Impl called.");};
		
		runnableImpl1.run();
		runnableImpl2.run();
	}
}
