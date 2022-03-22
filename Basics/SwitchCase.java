package com.tyss.corejava;

public class SwitchCase {
	public static void main(String[] args) {
		int stipend = 9500;
		switch (stipend) { // Switch(Values) Values must be a number,string,enum ! not a float number
		case 10000:
			System.out.println("Buy a Clothes");
			break;
		case 11000:
			System.out.println("Buy a Branded Clothes");
			break;
		case 12000:
			System.out.println("Buy a High cost Clothes");
			break;
		default:
			System.out.println("Stay PG and Eat");
		}
	}

}
