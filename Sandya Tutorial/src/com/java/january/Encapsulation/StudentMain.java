package com.java.january.Encapsulation;

import java.util.Date;

public class StudentMain {

	public static void main(String[] args) {
		
		
		  Student student = new Student();
		  
		  student.method();
		  
		  student.setStudentDateOfBirth(new Date(1995,12,12));
		   
		  student.setStudentCourse("Python Programming");
		  
		  student.setStudentId(1234);
		  
		  student.setStudentName("Raghu Ram");
		  
		  
		System.out.println( "Student Course : "+ student.getStudentCourse()+ " Student Name : "+student.getStudentName()+ " Student Id :" + student.getStudentId()  + " Student DOB : " + student.getStudentDateOfBirth());
		  
		  
		  
		  Student student2 = new Student();
		  
		  student2.setStudentDateOfBirth(new Date(1995,1,12));
		   
		  student2.setStudentCourse("Python ");
		  
		  student2.setStudentId(124);
		  
		  student2.setStudentName("Ram");
		  
		  

		
		  Student RaghuRam = new Student(1234,"Raghu Ram","Java Programming",new Date(2001,01,01));
		  
		
	}

}
