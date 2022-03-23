package com.tyss.abstractclass.example;

public class Emmi extends Pet {
	@Override
	void sound() {
		System.out.println("Meow Meow");

	}

	@Override
	void food() {
		System.out.println("Eat Milk");
	}

	@Override
	void play() {
		System.out.println("Play Ball");
	}
}
