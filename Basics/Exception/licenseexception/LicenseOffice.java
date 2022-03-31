package com.tyss.corejava.Exception.licenseexception;

public class LicenseOffice {
	private String name;
	private int age;

//	public String getName() {
//		return name;
//	}

	public void setName(String name) {
		this.name = name;
	}

//	public int getAge() {
//		return age;
//	}

	public void setAge(int age) {
		this.age = age;
	}

	public void Validate() {
		if (age >= 18 && age > 0) {
			System.out.println(name + " :Eligible for Applying License ");
		} else {
			try {
				throw new LicenseException(name + " :Not Eligible to Apply");
			} catch (LicenseException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}