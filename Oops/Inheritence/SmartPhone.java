package com.oops.corejava;

public class SmartPhone extends Phone {
	int camera_count;
	double camera;

	public SmartPhone() {
		super();
		System.out.println("The SmartPhone Class ========================================");
	}

	public SmartPhone(int price, int ram) {
		super(price, ram);
		System.out.println("The 2 Parameterized SmartPhone Class =================================");
	}

	// Constructor Chaining. Constructor(SmartPhone) Calling another
	// Constructor(Phone)
	public SmartPhone(int price, int ram, int camera_count, double camera) {
		super(price, ram);
		this.camera_count = camera_count;
		this.camera = camera;
		System.out.println("The 4 Parameterized SmartPhone Class");
	}

	public void play() {
		System.out.println("Playing Pubg");
	}

	public void selfie() {
		System.out.println("good");
	}
}
