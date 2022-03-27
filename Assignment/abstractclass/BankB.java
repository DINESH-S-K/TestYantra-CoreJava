package com.assignment.corejava.abstractclass;

public class BankB extends Bank{
	BankB(int balance) {
		super(balance);
		System.out.println("BankB");
	}
	@Override
	void deposit(int amount) {
		balance = balance + amount;
		System.out.println("B_Deposited :" + amount);
	}
	@Override
	void getBalance(){
		System.out.println("B_Balance :" + balance);  
	  }
}
