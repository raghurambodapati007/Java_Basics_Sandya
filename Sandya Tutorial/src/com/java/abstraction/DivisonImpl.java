package com.java.abstraction;

public  class DivisonImpl extends Calculator{

	//Object cant be created for abstract classes.
	//Because they are incomplete.

	@Override
	public double division(int a, int b) {
		
		if(a>b) {
			return a/b;
		}
		return b/a;
	}
		
}
