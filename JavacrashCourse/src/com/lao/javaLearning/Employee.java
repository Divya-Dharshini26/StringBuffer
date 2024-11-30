package com.lao.javaLearning;
//No arguments constructor

public class Employee {
	int empId;
	String empName;
	
	Employee(){
		empId= 1;
		empName= "divya";
		
		System.out.println(" Employee object is created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		

	}

}
