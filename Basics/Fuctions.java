package com.tyss.corejava;

public class Fuctions {	
	static float mul(float number1,float number2)
	{
		float result = number1 * number2;
		return result;
	}
	
	public static void main(String[] args) {
		
		
		float mul  = Fuctions.mul(3.5f,4.9f);
		System.out.println(mul);
	}

}
