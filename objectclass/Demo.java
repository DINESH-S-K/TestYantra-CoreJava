package com.tyss.objectclass;

import java.util.LinkedList;

public class Demo {
	@Override
	public String toString() {
		return "Object";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LinkedList<?>) {
			return true;
		} else {
			return false;
		}
	}
	
	public Demo() {
		System.out.println("Constructor");
	}
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//    	return ;
//    }
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("this is from finalize");
	}

	public static void main(String[] args) throws CloneNotSupportedException  {
		Demo demo = new Demo();
		System.out.println(demo);
		
		Demo demo2 = new Demo();
		System.out.println("Second " + demo2 );
	    boolean equals = demo2.equals(demo);
	    System.out.println(equals);
	    
	    Demo demo3 = new Demo();
	    int hashcode = demo3.hashCode();
	    System.out.println(hashcode);
	    System.out.println(demo3.getClass()); 
	    demo = null;
	    demo2 = null;
	    demo3 = null;
	    System.gc();
	    

	}

}
