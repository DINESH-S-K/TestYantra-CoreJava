package com.tyss.has$a$relationship;

public class Laptop {
	String brand;
	Rom rom;
	Battery battery;
	Screen screen;
	double price;
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", rom=" + rom + ", battery=" + battery + ", screen=" + screen + ", price="
				+ price + "]";
	}
}
