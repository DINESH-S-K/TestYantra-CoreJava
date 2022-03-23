package com.tyss.accessspecifier;

public class AccessSpecifier {
	public int a =10;
	private int b =20;
	protected int c = 30;
	int d = 40;
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	private void sub(int u,int i) {
		System.out.println(a+b);
	}
	protected void mul(int a,int b) {
		System.out.println(a+b);
	}
	void div(int a,int b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		AccessSpecifier accessSpecifier = new AccessSpecifier();
		System.out.println(accessSpecifier.a);
		System.out.println(accessSpecifier.b);
		System.out.println(accessSpecifier.c);
		System.out.println(accessSpecifier.d);
		
		accessSpecifier.add(4, 5);
		accessSpecifier.sub(6, 7);
		accessSpecifier.mul(7, 8);
		accessSpecifier.div(6, 8);
		
		
		
		
	}

}
