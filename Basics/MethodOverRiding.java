package com.tyss.corejava;

public class MethodOverRiding {
	public static void main(String[] args) {
		
    SubClass subclass  = new SubClass();
    subclass.Message();
    subclass.add(10, 20);
    
    
    Base base = new Base();
    base.Message();
    base.add(10, 20);
}
}
