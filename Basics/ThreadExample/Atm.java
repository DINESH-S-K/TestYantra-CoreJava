package com.tyss.corejava.ThreadExample;

public class Atm {
	public static void main(String[] args) {
		Account account = new Account(100000);
		Husband husband = new Husband(account);
		Wife wife = new Wife(account);

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());

		Thread.currentThread().setName("Mymain");
		Thread.currentThread().setPriority(10);

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());

		husband.start();
		wife.start();

		try {
			Thread.sleep(1000);
			account.getBalance();
		} catch (InterruptedException e) {
		}
	}
}
