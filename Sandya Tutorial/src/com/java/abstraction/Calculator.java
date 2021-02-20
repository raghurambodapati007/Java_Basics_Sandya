package com.java.abstraction;

public abstract  class Calculator {

	
	//Any method which has body implemented is called Concrete methods
	
	public int addition(int a, int b ) {
		return a +b;
	}
	
	public int subtraction(int a , int b) {
		if(a>b) {
			return a-b;
		}
		else {
			return b-a;
		}
	}
	
	public double multiplication(int a, int b) {
		return a*b;
	}
	
	// A method which is not implemented  is called abstract method. If a class contains one or more abstract methods 
	//that called is called abstract class
	public abstract double division(int a, int b);
}
