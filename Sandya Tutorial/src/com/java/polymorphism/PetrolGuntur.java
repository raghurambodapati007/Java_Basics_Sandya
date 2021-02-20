package com.java.polymorphism;

public class PetrolGuntur {

	public double calculatePrice(String refinery) {
		
		if(refinery.equals("HP")) {
			return 105;
			//			//basePrice + TaxPrice +TransportationToGuntur = Amount per liter 

		}
		else {
			return 100.0;
		}
		
	}
	
}
