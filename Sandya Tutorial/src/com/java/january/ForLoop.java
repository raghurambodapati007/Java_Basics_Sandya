package com.java.january;

public class ForLoop {

	public static void main(String[] args) {
		
		int[] intergersArray= {1,2,3,4,5};
		
		String[] stringArray= {"Raghu","Ram","Java","Developer"};
		
		/*
		 * for(int i= 0 ; i <=intergersArray.length; i++ ) {
		 * 
		 * int finalValue=intergersArray[i]*2;
		 * 
		 * System.out.println("Multiple of 2 is "+finalValue);
		 * 
		 * }
		 */
		
		//Advanced for-loop 
		
		for(int sandya : intergersArray) {
			System.out.println(sandya*2);
		}
		
		for(String value : stringArray) {
			System.out.println("value is "+value);
		}
		
		System.out.println("outside loop");

	}

}
