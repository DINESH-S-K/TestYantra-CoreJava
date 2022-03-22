package com.oops.corejava;
public class SuperKeyword extends ThisKeyword {
	
	int z,a,b,c,d;
	// super keyword used to access the super class.
	public SuperKeyword(int x,int y,int z)
	{
		super(x,y);
		this.z = z;
		System.out.println("Calling Method with - 3 Parameters");
	}
	
	public SuperKeyword(int x, int y, int z, int a, int b) {
	    this(x,y,z);
		this.a = a;
		this.b = b;
		System.out.println("Calling Method with - 5 Parameters");
	}

	public SuperKeyword(int x, int y, int z, int a, int b, int c, int d) {
	    this(x,y,z,a,b);
		this.c = c;
		this.d = d;
		System.out.println("Calling Method with - 7 Parameters");
	}
    
	
	
	

}
