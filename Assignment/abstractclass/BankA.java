package com.assignment.corejava.abstractclass;

public class BankA extends Bank {
	BankA(int balance) {
		super(balance);
		System.out.println("BankA");
	}

	@Override
	void deposit(int amount) {
		balance = balance + amount;
		System.out.println("A_Deposited :" + amount);
	}

	@Override
	void getBalance() {
		System.out.println("A_Balance :" + balance);
	}
}
