package com.assignment.corejava.array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int[] arr;
//		int[] arr1;
//		int []arr2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of an array :");
		int size = scanner.nextInt();
		arr = new int[size];

		int number;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter " + (i + 1) + " number :");
			number = scanner.nextInt();
			arr[i] = number;
		}

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0 ; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					System.out.println(arr[i] + " " + arr[j]);
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				    System.out.println(arr[i] + " " + arr[j]  + "changed");
				    System.out.println("===================================================");
				}
			}
			System.out.println("loop next iteration");
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
