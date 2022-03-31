package com.tyss.corejava.Exception.Bank;

public class Bank {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("The balance after the deposit is :" + balance);
	}

	public void withdraw(int amount) {
        if(amount <= balance && amount > 0) {
        	balance = balance - amount;
        	System.out.println("The balance left :"+balance);
        }else {
        	try {
        		throw new InsuffientBalanceException("Insufficient Balance");
        	}catch(InsuffientBalanceException e) {
        		System.out.println(e.getMessage());
        	}
        }
	}

}
