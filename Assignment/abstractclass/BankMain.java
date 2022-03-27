package com.assignment.corejava.abstractclass;

public class BankMain {
	public static void main(String[] args) {
	BankA bankA = new BankA(100);
	bankA.getBalance();
	bankA.deposit(100);
	bankA.getBalance();
	System.out.println("=============================================");
	
	BankB bankB = new BankB(150);
	bankB.getBalance();
	bankB.deposit(150);
	bankB.getBalance();
	System.out.println("=============================================");
	
	BankC bankC = new BankC(200);
	bankC.getBalance();
	bankC.deposit(200);
	bankC.getBalance();
	System.out.println("=============================================");
	
	Bank bank = new BankC(300);
	bank.getBalance();
	bank.deposit(200);
	bank.getBalance();
	
	}
}
