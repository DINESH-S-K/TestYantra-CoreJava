package com.assignment.corejava.Weekend;

import java.util.Scanner;
public class Assignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int Number = sc.nextInt();
		sc.close();
		for(int i=0;i<=Number;i++)
		{
			if(i%2==1)
			{
				System.out.println("Odd Number :" + i);
			}
			else
			{
				System.out.println("Even Number :" + i);
			}
		}
	}

}
