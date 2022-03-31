package com.assignment.corejava.methodreference;

public class MethodReference {
	public void chat(String str) {
		System.out.println("This is from chat" +" " +str);
	}

	public static void test(String str) {
		System.out.println("This is from test" + " "+ str );
	}

	public static void main(String[] args) {
		MethodRefInterface m = new MethodReference()::chat;
		m.message("Dinesh");
		System.out.println("===============================");
		MethodRefInterface m1 = MethodReference::test;
		m1.message("Nallish");
	}
}
