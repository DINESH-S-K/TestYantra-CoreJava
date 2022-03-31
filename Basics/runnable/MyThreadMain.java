package com.tyss.corejava.runnable;

public class MyThreadMain {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
	}
}
