package com.oops.corejava;

public class Phone {
	int price;
	int ram;
	String brand;

	public Phone() {
		System.out.println("The Phone class");
	}

	public Phone(int p, int r) {
		price = p;
		ram = r;
		System.out.println("The 2 Parameterized Phone class");
	}

	public void call() {
		System.out.println("I am Calling");
	}

	public void msg(String msg) {
		System.out.println(msg);
	}

	public void radio() {
		System.out.println("Playing Radio");
	}

}
