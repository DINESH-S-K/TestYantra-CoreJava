package com.tyss.has$a$relationship;

public class Flipkart {
	public static void main(String[] args) {
	Laptop laptop = new Laptop();
	
	Rom rom = new Rom();
	rom.brand  = "DDR4";
	rom.size  = 16;
	rom.clockSpeed = 2.4;
	
	Battery battery = new Battery();
	battery.brand = "Dell";
	battery.capacity = 10000;
	battery.type = "Lithium";
	
	Screen screen = new Screen();
	screen.brand = "Samsung";
	screen.resolution = 1080;
	screen.type = "oled";
	
	laptop.brand = "hp";
	laptop.price = 100000;
	laptop.battery = battery;
	laptop.rom = rom;
	laptop.screen = screen;
	
	System.out.println(laptop);
	
	}
}
