package com.tyss.corejava;

public class Variables {
	// It is a not bound to a class
	int a = 10; // instance variable
	// It is bound to a class
	static int b = 10; // static variable
	
	
	public static void main(String[] args) {
		
		int c = 10 ; // local variable
		System.out.println(c);
		
		System.out.println(Variables.b); // Static Variable access with the class-name.variable-name
		
		Variables v = new Variables(); // Instance Variable access by creating object
		System.out.println(v.a);
		
	}

}
