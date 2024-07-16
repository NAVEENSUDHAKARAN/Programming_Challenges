package com.chainsys.demo1;

import java.util.Arrays;
import java.util.Scanner;

class Employee {

	private int id;
	private String name;
	private String designation;
	private double salary;

	public Employee(int id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

}

class Company {

	private String companyName;
	private Employee[] employee;
	private int numEmployees;

	public Company(String companyName, Employee[] employee, int numEmployees) {
		super();
		this.companyName = companyName;
		this.employee = employee;
		this.numEmployees = numEmployees;
	}

	public double averageSalary() {
		double averageSalary = 0;
		for (Employee emp : employee) {
			averageSalary += emp.getSalary();
		}

		return averageSalary / numEmployees;
	}

	public double highestSalary() {
		double maxSal = 0;
		for (Employee emp : employee) {
			if (maxSal < emp.getSalary()) {
				maxSal = emp.getSalary();
			}
		}

		return maxSal;
	}

	@Override
	public String toString() {
		return "Company [employee=" + Arrays.toString(employee) + "]";
	}

	public void getEmployeesByDesignation(String designation) {

		for (Employee emp : employee) {
			if (emp.getDesignation().equalsIgnoreCase(designation)) {
				System.out.println("ID : " + emp.getId() + "Name : " + emp.getName() + "Designation : "
						+ emp.getDesignation() + "Salary : " + emp.getSalary());
			}
		}
	}

}

public class Demo4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Company Name : ");
		String companyName = scanner.nextLine();

		System.out.println("Number of Employees : ");
		int noOfEmployees = scanner.nextInt();

		Employee employee = new Employee();
		int id = 0;
		String name = "";
		String designation = "";
		double salary = 0;

		Employee[] emp = new Employee[noOfEmployees];
		System.out.println("Enter Employee Details : ");
		for (int i = 0; i < noOfEmployees; i++) {
			System.out.println("Employee :" + i + 1);
			System.out.println("Enter ID : ");
			id = scanner.nextInt();

			System.out.println("Enter Name : ");
			name = scanner.next();

			System.out.println("Enter Designation : ");
			designation = scanner.next();

			System.out.println("Enter Salary : ");
			salary = scanner.nextDouble();

			emp[i] = new Employee(id, name, designation, salary);

		}
		System.out.println("Enter Employee Designation : ");
		String empDesignation = scanner.next();

		Company company = new Company(companyName, emp, noOfEmployees);

		System.out.println("Highest Salary : " + company.highestSalary());
		System.out.println("Average Salary : " + company.averageSalary());
		company.getEmployeesByDesignation(empDesignation);

	}
}
