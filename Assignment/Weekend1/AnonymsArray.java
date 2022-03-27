package com.assignment.corejava.Weekend1;

public class AnonymsArray {
//	We can create an array without a name. Such types of nameless arrays are called anonymous arrays.
//	The main purpose of an anonymous array is just for instant use (just for one-time usage).
//	An anonymous array is passed as an argument of a method.
	public static void main(String[] args) {
		sum(new int[] { 1, 2, 3 });
	}

	public static void sum(int[] a) {
		int total = 0;
		for (int i : a)
			total = total + i;

		System.out.println("The sum is: " + total);
	}
}
