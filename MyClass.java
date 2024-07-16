package com.chainsys.demo1;

import java.util.Arrays;
import java.util.Scanner;

class EmployeeData{
	private int employeeld;
	private String name;
	private String branch;
	private double rating;
	private boolean usingTransport;
	
	public EmployeeData(int employeeld, String name, String branch, double rating, boolean usingTransport) {
		this.employeeld = employeeld;
		this.name = name;
		this.branch = branch;
		this.rating = rating;
		this.usingTransport = usingTransport;
	}
	
	public EmployeeData() {
		super();
	}
	
	public int getEmployeeld() {
		return employeeld;
	}
	public void setEmployeeld(int employeeld) {
		this.employeeld = employeeld;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isUsingTransport() {
		return usingTransport;
	}
	public void setUsingTransport(boolean usingTransport) {
		this.usingTransport = usingTransport;
	}

	@Override
	public String toString() {
		return "EmployeeData [employeeld=" + employeeld + ", name=" + name + ", branch=" + branch + ", rating=" + rating
				+ ", usingTransport=" + usingTransport + "]";
	}
	
	
	
}

public class MyClass {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number of Employees : ");
		int noOfEmployees = scanner.nextInt();
		EmployeeData empData = new EmployeeData();
		EmployeeData[] empDetails = new EmployeeData[noOfEmployees];
		
		for(int i=0; i<noOfEmployees; i+=1) {
			
			System.out.println("Enter ID : ");
			int empId = scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			String name = scanner.next();
			System.out.println("Enter Branch : ");
			String branch= scanner.next();
			System.out.println("Enter Ratings : ");
			double ratings = scanner.nextDouble();
			System.out.println("Utilizing Transport : ");
			boolean usingTransport = scanner.nextBoolean();
			empDetails[i] = new EmployeeData(empId, name, branch, ratings, usingTransport);
			
		}
		
		System.out.println("Enter the Branch to Count : ");
		String branchToCount = scanner.next();
		
		for(EmployeeData emp : empDetails ) {
			System.out.println(emp);
		}
	
		System.out.println("Count of employees using Transport : "+findCountOfEmployeesUsingCompTransport(empDetails, branchToCount));
	
		findEmployeeWithSecondHighestRating(empDetails);
	}
	
	public static int findCountOfEmployeesUsingCompTransport(EmployeeData[] employee, String branch) {
		int count =0;
		if(employee.toString().isEmpty()) {
			return 0;
		}
		
		for(EmployeeData emp : employee) {
			if(emp.getBranch().equalsIgnoreCase(branch) && emp.isUsingTransport()) {
				count++;
			}
		}
		return count;
	}
	
	public static void findEmployeeWithSecondHighestRating(EmployeeData[] employee) {
		double highest = 0;
		if(employee == null) {
			System.out.println("All Employees using company transport");
			return;
		}
		for(EmployeeData emp : employee) {
			if(emp.getRating() > highest && emp.isUsingTransport() == false) {
				highest = emp.getRating();
			}
		}

		double secondHighest = 0;
		for(EmployeeData emp : employee) {
			if(emp.getRating() > secondHighest && emp.getRating() != highest && emp.isUsingTransport() == false) {
				secondHighest = emp.getRating();
			}
		}

		for(EmployeeData emp : employee) {
			if(emp.getRating() == secondHighest) {
				System.out.println("ID : " + emp.getEmployeeld() + " Name : " + emp.getName());
			}
		}

		
	}
}
