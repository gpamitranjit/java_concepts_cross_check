package com.amdocs;

/**
 * @author Amit
 *
 */
public class MainApp_2 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello from run method of thread.");
			}
		}).start();
		
		
//		now using lambda expressions
		new Thread(() -> {System.out.println("hello from run method of thread.");}).start();
	}

}
