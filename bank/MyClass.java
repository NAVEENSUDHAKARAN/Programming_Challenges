package com.chainsys.bank;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Bank to Check Balance");
		int option = scanner.nextInt();
		
		BankA a = new BankA(); 
		BankB b = new BankB();
		BankC c = new BankC();
		
		if(option == 1) {
			a.getBalance();
		}
		if(option == 2) {
			b.getBalance();
		}
		if(option == 3) {
			c.getBalance();
		}
	}
}
