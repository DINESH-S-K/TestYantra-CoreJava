package com.tyss.corejava;

public class MethodOverloading {
    
	static int a = 10;
	int b = 20;
	
	static void add(int a, int b)
	{
		System.out.println(a+b);
		System.out.println("1-------------");
	}
	static void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
		System.out.println("2-------------");
	}
	static void add(double a, double b)
	{
		System.out.println(a+b);
		System.out.println("3-------------");
	}
	static void add(int a, double b)
	{
		System.out.println(a+b);
		System.out.println("4-------------");
	}
	static void add(double a, int b)
	{
		System.out.println(a+b);
		System.out.println("5-------------");
	}
	public static void main(String[] args) {
		
		MethodOverloading.add(5, 5);
		MethodOverloading.add(5, 5, 5);
		MethodOverloading.add(5.5, 4.5);
		MethodOverloading.add(5, 4.5);
		MethodOverloading.add(5.5, 5);
	}
	
	// 1.Name should be same
	// 2.The Number of arguments should be different
	// 3.The type of argument should be different
	// 4.The order of the argument with its data type should be different 
}
