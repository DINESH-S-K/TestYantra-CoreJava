package com.tyss.corejava;
//Calling a constructor with a new keyword to create a object
public class Constructor {
	Constructor()
	{
		System.out.println("I am Constructor");
		// Special Function that has a class name and without return type
		// Used for instantiation or creation of object or initialization
	}
 public static void main(String[] args) {
	Constructor cons = new Constructor();
	System.out.println(MethodOverloading.a);
	
	MethodOverloading m = new MethodOverloading();
	System.out.println(m.b);//Instance Variable of Another Class.
	
	MethodOverloading.add(4, 5);
}
}
