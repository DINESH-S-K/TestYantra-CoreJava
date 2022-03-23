package com.assignment.corejava.TernaryOperator;

import java.util.Scanner;

public class TernaryOperatorExample {
	static void GettingPermission(int age) {
		
		String Ticket  = (age >= 18) ? "Adult Ticket" : "Minor Ticket";
		System.out.println(Ticket);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age :");
		int age = sc.nextInt();
		sc.close();
		GettingPermission(age);
		
	}
	
}
