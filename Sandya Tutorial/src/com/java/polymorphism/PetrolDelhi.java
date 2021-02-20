package com.java.polymorphism;

public class PetrolDelhi extends Petrol {

	public double calculatePrice(String refinery) {
	
		if (refinery.equals("RELIANCE")) {
			return 90.0;
			
			//basePrice + TaxPrice +TransportationToDelhi  = Amount per liter 
		}
		else {
			return 100.0;
		}
		
	}
}

