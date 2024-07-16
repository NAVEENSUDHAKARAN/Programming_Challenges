package com.chainsys.memberdetails;

public class Employee extends Member{

	String specialization;
	String department;
	
	public Employee(String name, int age, long phoneNumber, String address, double salary, String specialization,
			String department) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
		this.department = department;
	}
	
	
}
