package com.tyss.corejava;

public class Main {
	public static void main(String[] args) {
	Ferrari ferrari = new Ferrari();
	ferrari.drive();
	ferrari.brake();
	ferrari.horn();
	
	System.out.println("====================================");
	
	Audi audi = new Audi();
	audi.drive();
	audi.brake();
	audi.horn();
	}
}
