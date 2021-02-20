package com.java.february.inheritence;

public class Dog extends Animal{
	
	private String dogName;
	private String dogColor;
	private String dogType;
	private Animal animal;
	
	public Dog() {}
	
	public Dog(String dogName,String dogColor,String type) {

		this.dogColor=dogColor;
		this.dogName=dogName;
		this.dogType=type;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getDogColor() {
		return dogColor;
	}

	public void setDogColor(String dogColor) {
		this.dogColor = dogColor;
	}

	public String getDogType() {
		return dogType;
	}

	public void setDogType(String dogType) {
		this.dogType = dogType;
	}
	
	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + ", dogColor=" + dogColor + ", dogType=" + dogType + "]";
	}



	}
