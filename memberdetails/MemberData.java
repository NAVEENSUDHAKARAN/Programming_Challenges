package com.chainsys.memberdetails;

import java.util.Scanner;

public class MemberData {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = scanner.next();
		
		System.out.println("Enter Age : ");
		int age = scanner.nextInt();
		
		System.out.println("Enter Mobile Number : ");
		long mobileNumber = scanner.nextLong();
		
		System.out.println("Enter Address : ");
		String address = scanner.next();
		
		System.out.println("Enter Salary : " );
		double salary = scanner.nextDouble();
		
		System.out.println("Enter Specialization : ");
		String specs = scanner.next();
		
		System.out.println("Enter Department : ");
		String department = scanner.next();
		
		Employee employee = new Employee(name, age, mobileNumber, address, salary, specs, department);
		Manager manager = new Manager(name, age, mobileNumber, address, salary, specs, department);
		
		System.out.println("Name : " + employee.getName());
		System.out.println("Number : " + manager.getPhoneNumber());
	}
}
