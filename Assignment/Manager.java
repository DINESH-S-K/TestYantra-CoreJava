package com.assignment.corejava;

public class Manager extends Member {
  String department;

public Manager(String name, int age, long phone_Number, String address, int salary, String department) {
	super(name, age, phone_Number, address, salary);
	this.department = department;
}
  
}
