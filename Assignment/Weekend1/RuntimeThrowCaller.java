package com.assignment.corejava.Weekend1;

import java.util.Scanner;

public class RuntimeThrowCaller {
	public static void main(String[] args) {
		int a, b;
		RuntimeThrowsRecipient runtimeThrows = new RuntimeThrowsRecipient();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Numbers :");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		double c;
		try {
			c = runtimeThrows.div(a, b);
			System.out.println(c);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Enter the demon > 0");
		}
	}
}
