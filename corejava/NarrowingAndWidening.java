package com.oops.corejava;

public class NarrowingAndWidening {
	public static void main(String[] args) {
		
		// Widening
		int x =10;
		long y = x;
		System.out.println(y);
		
		//Narrowing
		long a = 100;
		int b = (int)a;
		System.out.println(b);
		
		byte v = 20;
		byte c = 30;
		byte k = (byte)(v+c);
		System.out.println(k);
		
		short r = 10;
		short i = 20;
		short j = (short)(r+i);
		System.out.println(j);
		
		}
}
