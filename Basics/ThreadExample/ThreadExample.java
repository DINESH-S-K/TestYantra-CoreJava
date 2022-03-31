package com.tyss.corejava.ThreadExample;

public class ThreadExample extends Thread {
	int max;

	public ThreadExample(int max) {
		this.max = max;
	}

	@Override
	public void run() {
		while (max > 0) {
			if (max % 2 == 0) {
				System.out.println(max);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.fillInStackTrace();
					System.out.println("dfdf");
				}
			}
			max--;
		}
	}

	public static void main(String[] args) {
		ThreadExample threadExample = new ThreadExample(10);
		threadExample.start();
		ThreadExample threadExample2 = new ThreadExample(20);
		threadExample2.start();
	}
}
