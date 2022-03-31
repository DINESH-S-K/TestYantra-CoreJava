package com.tyss.corejava.interfaceex;

public class Class1 implements Interface,Interface2 {
   @Override
   public void message() {
	   System.out.println("Nallish");
	   Interface.super.message();
	   Interface2.super.message();
   }
}
