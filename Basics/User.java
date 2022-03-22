package com.tyss.corejava;

public class User {
	String name;
	long number;

	public User() {
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public User(String name, long number) {
		this.name = name;
		this.number = number;
		System.out.println("User Class");
	}

	public void call() {
		System.out.println(name + " is calling");
	}

	public void videocalling() {
		System.out.println(name + " is video calling");
	}

	public void share() {
		System.out.println(name + " is sharing");
	}

}
