package com.chainsys.bank;

public class BankA implements Bank {

	double amount = 1000;
	
	@Override
	public void getBalance() {
		System.out.println("Balance in BankA ---> " + amount);
	}
	
}
