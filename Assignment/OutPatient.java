package com.assignment.corejava;

public class OutPatient extends Patient {
	String PatientType;

	public OutPatient(int regno, String name, String patientType) {
		super(regno, name);
		PatientType = patientType;
	}

}
