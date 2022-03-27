package com.assignment.corejava.abstractclass;

public class BankC extends Bank{
	BankC(int balance) {
		super(balance);
		System.out.println("BankC");
	}
	
	@Override
	void deposit(int amount) {
		balance = balance + amount;
		System.out.println("C_Deposited :" + amount);
	}
	@Override
	void getBalance(){
		System.out.println("C_Balance :" + balance);  
	  }
}
