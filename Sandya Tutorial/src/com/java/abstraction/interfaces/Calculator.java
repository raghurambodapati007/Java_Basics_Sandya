package com.java.abstraction.interfaces;

public interface Calculator {

	// only abstract methods 
	public int add(int a, int b);
	
	public int sub(int a, int b);
	
	public double multiplication(int a, int b);
	
	public double division(int a,int b);
	
	// In java 8 , new feature was introduced 
	// interface can have impl for 2 methods which are default and static
	
	public default int methodName() {
		return 0;
	}
	
	public default int methodName1() {
		return 0;
	}
	
	public static int method() {
		return 0;
	}
	
	public static int method1() {
		return 0;
	}
	
}
