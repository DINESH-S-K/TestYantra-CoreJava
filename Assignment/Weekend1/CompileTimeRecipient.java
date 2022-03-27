package com.assignment.corejava.Weekend1;

public class CompileTimeRecipient {

	public void thread() throws InterruptedException {
		Thread.sleep(1000);
		Thread.currentThread().interrupt();
		if (Thread.interrupted()) {
			throw new InterruptedException();
		}
	}

}
