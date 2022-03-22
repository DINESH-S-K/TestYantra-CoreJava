package com.tyss.corejava;

public class IfElseIf {
 public static void main(String[] args) {
	
	 int stipend = 10000;
	 if (stipend < 10000)
	 {
		 System.out.println("Buy a Clothes");
	 }
	 else if(stipend > 10000 && stipend < 11000)
	 {
		 System.out.println("Buy a Branded Clothes");
	 }
	 else if(stipend > 12000)
	 {
		 System.out.println("Buy a High cost Clothes");
	 }
	 else
	 {
		 System.out.println("Stay PG and Eat");
	 }
}
}
