package com.java.polymorphism;

public class Vehicle {
	
	private String vehicleColor;
	private String vehicleName;
	
	public Vehicle() {
		
	}
	 public Vehicle(String color,String name) {
		 this.vehicleColor=color;
		 this.vehicleName=name;
	 }
	public String getVehicleColor() {
		return vehicleColor;
	}
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	 
	 public double cost() {
		 return 30.0;
	 }
	 
	 public double cost(int amount) {

		 return amount;
	 }
	 
	 public double cost(String amount) {

		 return 10.0;
	 }

	 public double calculateAmount(int amount,int modelValue) {
		 
		 if(amount !=0 && modelValue !=0) {
			 return 100.0;
		 }
		 else {
			 return 0;
		 }
	 }
	 
	 public double cost(int modelValue,double amount) {
		 return 10000.0;
	 }

}
