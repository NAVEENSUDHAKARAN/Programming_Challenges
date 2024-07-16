package com.chainsys.bank;

public class BankB implements Bank{

	double amount = 1500;
	
	@Override
	public void getBalance() {
		System.out.println("Balance in BankB ---> " + amount);		
	}

}
