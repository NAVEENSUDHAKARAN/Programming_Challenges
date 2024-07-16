package com.chainsys.memberdetails;

public class Member {
	String name;
	int age;
	long phoneNumber;
	String address;
	double salary;
	
	public Member(String name, int age, long phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	
	public Member() {
		super();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public double getSalary() {
		return salary;
	}
	
	
	
	
}
