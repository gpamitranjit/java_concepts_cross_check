package com.amdocs.mainApp_10;

/**
 * @author amit
 *
 */
public class MainApp_10_1 implements MyData {

//	this is poor null check implementation!
	public boolean isNull(String str) {
		System.out.println("Impl Null check.");
		
		return str == null ? true : false;
	}
	
	public static void main(String[] args) {
		MainApp_10_1 obj = new MainApp_10_1();
//		obj.print("");
		
		System.out.println("====================================");
		obj.print("amit");
		
	}

}
