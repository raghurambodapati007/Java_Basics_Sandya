package com.java.abstraction.interfaces;

public class CalculatorImpl implements Calculator{
	
	@Override
	public double multiplication(int a, int b) {
		return a*b;
	}
	
	@Override
	public  double division(int a, int b) {
		return a/b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
