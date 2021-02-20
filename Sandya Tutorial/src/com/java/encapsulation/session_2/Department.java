package com.java.encapsulation.session_2;

public class Department {
	
	private int departmentid;
	private String departmentName;
	
	
	public Department() {}
	
	public Department(int departmentid, String departmentName) {
		this.departmentid = departmentid;
		this.departmentName = departmentName;
	}


	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentName=" + departmentName + "]";
	}

	//Getter and setters

	public int getDepartmentid() {
		return departmentid;
	}


	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
