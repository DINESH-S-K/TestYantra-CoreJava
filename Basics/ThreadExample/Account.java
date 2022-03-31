package com.tyss.corejava.ThreadExample;

public class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public synchronized void Withdrawel(int amount) { // Stop Two Threads process concurrently
		if (amount < balance) {
			balance = balance - amount;
		}
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void getBalance() {
		System.out.println("The balance is :" + balance);
	}

}
