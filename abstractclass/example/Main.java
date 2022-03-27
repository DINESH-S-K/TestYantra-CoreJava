package com.tyss.abstractclass.example;

public class Main {
	public static void main(String[] args) {
		Pet p = new Byrav();
		p.food();
		p.play();
		p.sound();

		Pet p1 = new Emmi();
		p1.food();
		p1.play();
		p1.sound();
	}
}
