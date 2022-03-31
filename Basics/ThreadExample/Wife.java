package com.tyss.corejava.ThreadExample;

public class Wife extends Thread {
	Account account;

	public Wife(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 0; i < 100; i++) {
			account.Withdrawel(100);
		}
	}

}
