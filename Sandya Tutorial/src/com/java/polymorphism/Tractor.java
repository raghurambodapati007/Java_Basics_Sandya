package com.java.polymorphism;

public class Tractor extends Vehicle{

	public String tractorName;
	public String tractorColor;
	
	public Tractor() {
		
	}
	
	
	 public double cost(int modelValue,double amount) {
		return modelValue + amount;
	}
	
	
	public double calculateAmount(int amount,int price) {
		return amount*price;
	}
	
}
