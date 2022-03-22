package com.assignment.corejava;

import java.util.Scanner;
public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int Number = sc.nextInt();
		System.out.println("Enter a Limit :");
		int limit = sc.nextInt();
		sc.close();
		System.out.println("Multiplication Table of : "+Number);
		for(int i=1;i<=limit;i++)
		{
			System.out.println(i +" " +"x " + Number + " = " +(i*Number));
		}
	}

}
