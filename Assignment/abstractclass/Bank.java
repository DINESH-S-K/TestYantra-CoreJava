package com.assignment.corejava.abstractclass;

public abstract class Bank {
  int balance;
  
  Bank(int balance){
	  this.balance = balance;
	  System.out.println("Bank Arrived");
  }
  abstract void deposit(int amount);
  abstract void getBalance();
}
