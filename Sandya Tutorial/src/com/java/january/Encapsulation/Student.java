package com.java.january.Encapsulation;

import java.util.Date;

//POJO plain old java object

public class Student {


	//Instance variables
	
	private int studentId ;
	private String studentName,studentCourse;
	private Date StudentDateOfBirth;
	
	
public String method() {
	return "infosys" ;
}
	
	//GETTERS SETTERS

	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public Date getStudentDateOfBirth() {
		return this.StudentDateOfBirth;
	}

	public void setStudentDateOfBirth(Date studentDateOfBirth) {
		this.StudentDateOfBirth = studentDateOfBirth;
	}

	//Default Constructor
	public Student() {
		
	}

	public Student(int studentId, String studentName, String studentCourse, Date studentDateOfBirth) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		StudentDateOfBirth = studentDateOfBirth;
	}
	
	
	

}
