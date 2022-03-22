package com.assignment.corejava;

import java.util.Scanner;
/**
 * @author dinesh
 *
 */
public class Assignment2 {
	static void Series(int a, int b, int c) {
		int sum = a + b;
		System.out.println("The Series will be :");
		System.out.print(sum);

		for (int i = 1; i < c; i++) {
			System.out.print(",");
			int start = (int) Math.pow(2, i) * b;
			sum = sum + start;
			System.out.print(sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a and b :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("Enter a Limit of a Series :");
		int c = sc.nextInt();
		sc.close();
		Series(a, b, c);
	}
}
