package com.java.february.inheritence;

public class Animal {

	private String animalName;
	private String animalColor;
	private String animalType;
	
	//Default Constructor
	public Animal() {
		
	}
	
	//Parameterised Constructor
	public Animal(String animalName, String animalColor, String animalType) {
		this.animalColor=animalColor;
		this.animalName=animalName;
		this.animalType=animalType;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalColor() {
		return animalColor;
	}

	public void setAnimalColor(String animalColor) {
		this.animalColor = animalColor;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	@Override
	public String toString() {
		return "Animal [animalName=" + animalName + ", animalColor=" + animalColor + ", animalType=" + animalType + "]";
	}

	
	
	
}
