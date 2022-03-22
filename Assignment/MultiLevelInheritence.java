package com.assignment.corejava;

public class MultiLevelInheritence {
	public static void main(String[] args) {
		TypeOfInpatient typeOfInpatient = new TypeOfInpatient(1,"Akshy","inpatient","Not Serious");
		System.out.println(typeOfInpatient.regno);
		System.out.println(typeOfInpatient.name);
		System.out.println(typeOfInpatient.PatientType);
		System.out.println(typeOfInpatient.Type);
		
		System.out.println("=============================================================");
		TypeOfInpatient typeOfInpatient1 = new TypeOfInpatient(2,"Arthi","inpatient","Serious");
		System.out.println(typeOfInpatient1.regno);
		System.out.println(typeOfInpatient1.name);
		System.out.println(typeOfInpatient1.PatientType);
		System.out.println(typeOfInpatient1.Type);
	}

}
