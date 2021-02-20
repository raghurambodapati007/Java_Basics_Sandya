package com.java.february.inheritence;

public class InheritanceTesterMain {

	public static void main(String[] args) {
		
			
		Dog dog = new Dog();
		
		dog.setAnimalColor("Black");
		dog.setAnimalName("Dog");
		dog.setAnimalType("Domestic");
		
		dog.setDogColor("Gold");
		dog.setDogName("Mahi");
		dog.setDogType("Domestic");

		dog.setAnimal(dog);
		
		System.out.println(dog.getAnimalColor());
		
		System.out.println(dog.getAnimal().getAnimalName());
		
	}

}
