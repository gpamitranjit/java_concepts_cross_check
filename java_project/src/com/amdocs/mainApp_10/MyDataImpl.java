package com.amdocs.mainApp_10;

/**
 * @author amit
 *
 */
public class MyDataImpl implements MyData {

//	this is poor null check implementation!
	public boolean isNull(String str) {
		System.out.println("Impl Null check.");
		
		return str == null ? true : false;
	}
	
	public static void main(String[] args) {
		MyDataImpl obj = new MyDataImpl();
//		obj.print("");
		
		System.out.println("====================================");
		obj.print("amit");
	}

}
