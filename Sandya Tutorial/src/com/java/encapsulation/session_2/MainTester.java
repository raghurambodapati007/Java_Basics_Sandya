package com.java.encapsulation.session_2;

public class MainTester {

	public static void main(String[] args)  {
		
		
		
		Department dept = new Department();
		
		dept.setDepartmentid(1);
		dept.setDepartmentName("CSE");
		
		Library library = new Library();
		
		library.setBookId(100);
		library.setBookName("OOAD design");
		
		Employee emp = new Employee();
		
		emp.setEmployeeId(1234);
		emp.setEmployeeName("SANDYA");
		emp.setEmployeeSalary(450000);
		emp.setDepartment(dept);
		emp.setLibrary(library);

		System.out.println("Employee Name is : "+ emp.getEmployeeName());
		System.out.println("Employee Id is :"+emp.getEmployeeId());
		System.out.println("Employee Department name is  :"+ emp.getDepartment().getDepartmentName());
		System.out.println("Employee Library id is :"+emp.getLibrary());
		
		
		
		
		/*
		 * Department department = new Department(3,"CSE");
		 * 
		 * Library library =new Library(9,"Data Structures");
		 * 
		 * Employee emp = new Employee(1234,"Raghu",10000, department, library);
		 */						
		/*
		 * emp.employeeId=1234; emp.employeeName="Raghu"; emp.employeeSalary=10000;
		 * emp.department.departmentid=3;
		 * emp.department.departmentName="Computer Science & Engineering";
		 * emp.library.bookId=9990;
		 * emp.library.bookName="Data Structures and algorithms ";
		 */		
		

		System.out.println(emp);
	}

}
