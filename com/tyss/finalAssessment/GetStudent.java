package com.tyss.finalAssessment;

import java.util.Scanner;
import java.util.Set;

public class GetStudent {
	public void getStudent(Set<Student> set, Scanner scanner) {
		boolean status = true;
		System.out.println("====================");
		System.out.print("Enter Student Id for Details :");
		int checkId = scanner.nextInt();
		for (Student student : set) {
			if (student.id == checkId) {
				status = false;
				System.out.println(student);
				break;
			}
		}
		if (status) {
			System.out.println("Id Doesn't Exit");
		} else {
			System.out.println("!!--Successfully Getting Student Details--!!");
		}
		System.out.println("====================");
	}
}
