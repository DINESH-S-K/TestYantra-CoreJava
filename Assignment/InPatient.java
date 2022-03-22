package com.assignment.corejava;

public class InPatient extends Patient {
	String PatientType;

	public InPatient(int regno, String name, String patientType) {
		super(regno, name);
		PatientType = patientType;
		System.out.println("Child Class");
	}

}
