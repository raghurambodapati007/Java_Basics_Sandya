package com.java.abstraction.interfaces.both;

public class Main {

	public static void main(String[] args) {
		
		CalculatorInterfaceImpl calculatorInterfaceImpl = new CalculatorInterfaceImpl();
		
		System.out.println(calculatorInterfaceImpl.addition(100,100));  // From abstract class
		
		System.out.println(calculatorInterfaceImpl.subtraction(1000,100)); //  From abstract class extending class
		
		System.out.println(calculatorInterfaceImpl.multiplication(100,100));  //From interface impl
		
		System.out.println(calculatorInterfaceImpl.divison(100,10)); //interface impl
	}

}
