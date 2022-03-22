package com.assignment.corejava;

public class Employee extends Member{
	String specialization;

	public Employee(String name, int age, long phone_Number, String address, int salary, String specialization) {
		super(name, age, phone_Number, address, salary);
		this.specialization = specialization;
	}
}
