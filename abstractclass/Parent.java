package com.tyss.abstractclass;

public abstract class Parent {
	int x;
	static int y;
	
	public Parent(int x) {
		this.x = x;
	}
	
	abstract void m1();
	
	void m2() {
		System.out.println("m2 is calling " + x);
	}

}
