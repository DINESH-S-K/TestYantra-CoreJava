package com.tyss.corejava;

public class Admin extends User {
	
	public Admin(String name, long number) {
		super(name,number);
		System.out.println("Admin Class");
	}
	public void Adduser(String name, long number) {
		
		System.out.println(name + " is adding number :" + number);
	}
	public void RemoveUser(String Name,long number) {
		System.out.println(name + " is removing :" + number);
	}
}
