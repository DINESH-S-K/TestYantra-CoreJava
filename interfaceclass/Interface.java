package com.tyss.interfaceclass;

public class Interface {
	public static void main(String[] args) {
		Calculator cal = new Casio();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(10, 20));
		System.out.println(cal.mul(10, 20));
		System.out.println(cal.div(10, 20));

		Calculator cal1 = new Citizen();
		System.out.println(cal1.add(10, 20));
		System.out.println(cal1.sub(10, 20));
		System.out.println(cal1.mul(10, 20));
		System.out.println(cal1.div(10, 20));
	}
}
