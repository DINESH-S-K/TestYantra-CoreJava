package com.tyss.corejava.Exception.licenseexception;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Name :");
		String name = scanner.next();
		
		System.out.print("Enter the Age :");
		int age = scanner.nextInt();
		
		LicenseOffice licenseOffice = new LicenseOffice();
		licenseOffice.setName(name);
		licenseOffice.setAge(age);
		
		
		licenseOffice.Validate();
	}
}
