package com.chainsys.bank;

public class BankC implements Bank{

	double amount = 2000;
	
	@Override
	public void getBalance() {
		System.out.println("Balance in BankC ---> " + amount);
		
	}
	
}
