package com.assignment.corejava.abstractclass;

public class BankMain {
	public static void main(String[] args) {
	BankA bankA = new BankA();
	bankA.getBalance();
	BankB bankB = new BankB();
	bankB.getBalance();
	BankC bankC = new BankC();
	bankC.getBalance();
	
	bankA.balance = 400;
	bankA.getBalance();
	
	Bank bank = new BankC();
	bank.getBalance();
	
	}
}
