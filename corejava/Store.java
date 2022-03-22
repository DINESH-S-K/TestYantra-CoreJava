package com.oops.corejava;

public class Store {
	public static void main(String[] args) {
//		Phone p = new Phone();
//		p.price = 1999;
//		p.ram = 4;
//		p.brand ="Nokia";
//		
//		p.call();
//		p.msg("I love myself");
//		p.radio();
//		
//		System.out.println("=======================================================");
//		
//		SmartPhone sm = new SmartPhone();
//		sm.brand ="iphone";
//		sm.camera = 30.7;
//		sm.camera_count=3;
//		sm.price = 100000;
//		sm.ram = 8;
//		
//		sm.call();
//		sm.msg("Ilove");
//		sm.play();
//		sm.radio();
//		sm.selfie();

//		Samsung samsung = new Samsung();
//		samsung.brand ="M20";
//		samsung.camera = 40;
//		samsung.camera_count = 2;
//		samsung.price = 10000;
//		samsung.ram = 6;
//		samsung.SpecialFeature = "good";
//		samsung.SamS();
//		
//		Iphone iphone = new Iphone();
//		iphone.brand();

//		Phone phone = new Phone(12000,4); 
//		System.out.println(phone.price);
//		System.out.println(phone.ram);
//		
//		Phone phone2 = new Phone(13000,5);
//		System.out.println(phone2.price);
//		System.out.println(phone2.ram);

		SmartPhone smartPhone = new SmartPhone();

		SmartPhone smartPhone1 = new SmartPhone(2000, 4);
		System.out.println(smartPhone1.price);

		SmartPhone smartPhone2 = new SmartPhone(3000, 4, 5, 6);
		System.out.println(smartPhone2.camera_count);
		System.out.println(smartPhone2.camera);
	}

}
