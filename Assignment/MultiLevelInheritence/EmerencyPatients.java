package com.assignment.corejava.MultiLevelInheritence;

public class EmerencyPatients extends Patient {
	String PatientType;

	public EmerencyPatients(int regno, String name, String patientType) {
		super(regno, name);
		PatientType = patientType;
	}

}
