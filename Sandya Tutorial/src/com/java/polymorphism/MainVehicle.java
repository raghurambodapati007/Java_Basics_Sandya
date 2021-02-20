package com.java.polymorphism;

public class MainVehicle {

	public static void main(String[] args) {


		Vehicle vehicle = new Vehicle();
		
		System.out.println(vehicle.cost(1000));
		
		Tractor tractor = new Tractor();
		
		System.out.println(tractor.calculateAmount(1000,1000));

	}

}
