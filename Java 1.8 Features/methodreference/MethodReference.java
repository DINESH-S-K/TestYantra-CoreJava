package com.tyss.corejava.methodreference;

public class MethodReference {
public void chat() {
	System.out.println("This is from chat");
}

public static void test() {
	System.out.println("This is from test");
}

public static void main(String[] args) {
	MethodRefInterface m  = new MethodReference() :: chat;
	m.message();
	System.out.println("===============================");
	MethodRefInterface m1  = MethodReference:: test ;
	m1.message();
}
}
