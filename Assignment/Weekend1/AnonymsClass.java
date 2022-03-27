package com.assignment.corejava.Weekend1;

class Test {
	public void display() {
		System.out.println("Inside the Test class");
	}
}

public class AnonymsClass {
	public static void main(String[] args) {
		Test p1 = new Test() {
			@Override
			public void display() {
				System.out.println("Inside an anonymous class.");
			}
		};
		p1.display();
	}
}
