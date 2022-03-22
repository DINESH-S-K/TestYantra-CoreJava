package com.assignment.corejava;

public class TypeOfInpatient extends InPatient {
	String Type;

	public TypeOfInpatient(int regno, String name, String PatientType, String type) {
		super(regno, name, PatientType);
		Type = type;
		System.out.println("Grand Child Class");
	}

}
