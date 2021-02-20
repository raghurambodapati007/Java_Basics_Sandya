package com.java.exception;

import java.io.IOException;

class  test{
	public static void main(String[] args) throws IOException {
		
		test2 test2 = new test2();
		
		try {
		test2.main(null);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("successful");
	}
}


//try {a}catch(){} -> b throws Exception -> c throws Exception -> d  throws Exception-> e throws Exception  ->f ( may or may not exception ) throws Exception 