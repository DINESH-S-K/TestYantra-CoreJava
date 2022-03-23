package com.assignment.corejava.MultiLevelInheritence;

public class Patient {
	int regno;
	String name;

	public Patient(int regno, String name) {
		this.regno = regno;
		this.name = name;
		System.out.println("Parent Class");
	}

}
