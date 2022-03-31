package com.tyss.corejava.lambda;

public class Main {
 public static void main(String[] args) {
	MyFuctionalInterface obj = (x,y)->{
		return x+y;
	};
	double add = obj.add(10, 20);
	System.out.println(add);
}
}
