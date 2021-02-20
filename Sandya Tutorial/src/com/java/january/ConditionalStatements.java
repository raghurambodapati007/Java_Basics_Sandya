package com.java.january;

import java.util.Scanner;

public class ConditionalStatements {
	
	static int voterAge;
	
	static String voterCountry;

	public static void main(String[] args) {
		
		// For importing userData
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter age of voter");
		System.out.println();
		voterAge=  input.nextInt();
		
		System.out.println("Enter String");
		voterCountry = input.next();
		
/*		if(voterAge > 18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible for voting");
		}*/
		
		// ternary operation 
		String value=(voterAge>18) ? (voterCountry.equals("INDIA")) ? "Indian ": "Not Indian"  : "Not eligible for voting ";
		System.out.println(value);
			
/*
 * if(voterAge>18) {
 * 
 * if(voterCountry.equals("INDIA")) { System.out.println("Eligible for voting");
 * } else { System.out.println("Voter is not indian"); } } else {
 * System.out.println("Voter age is not permitted"); }
 */
		
/*
 * if((voterAge >18) && (voterCountry.equals("INDIA"))) {
 * System.out.println("Eligible for voting"); } else {
 * System.out.println("Not Eligible for voting"); }
 */
	}

}
