package com.java.january;

public class January {

	 static int staticVariable = 2021;  //Static variable
	 
	 int instanceVariable=2021;   // instance variable
	 
	static String name="Master";   // instance 
	
	static float  floatNumber=10;
	 

	public static void main(String[] args) {
			
		/* Name here is an local variable whose scope is within the method only */
		  //name = "Sandya"; 
		  
		 // System.out.println("The Local variable  is  "+name);
		  
		  System.out.println("The static variable is "+staticVariable);
		  
		  System.out.printf("printing via printf  : %f",floatNumber);
		  
		//  January jan = new January();
		  		
		  //LocalVariable
		 //String localName= jan.name;
		  
		 // jan.jan26();
		  
		  
	} 

	
	public  void jan26() {
		
		name = "sandya";
		
	
		System.out.println("Instance variable is "+instanceVariable);	
		
		//System.out.println("Static variable is "+name);
		
		System.out.println("The static variable is "+staticVariable);
		
		jan27();
		
	
	}
	
	public void jan27() {
		System.out.println("name is "+name);
		name = " sandya vetapalem";
		System.out.println("name is now "+name);
	}

}
