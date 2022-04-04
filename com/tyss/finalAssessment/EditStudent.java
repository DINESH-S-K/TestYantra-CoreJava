package com.tyss.finalAssessment;

import java.util.Scanner;
import java.util.Set;

public class EditStudent {
	void editStudent(Set<Student> set, Scanner scanner) {
		boolean status = true;
		System.out.println("====================");
		System.out.print("Enter Student Id for Edit Details :");
		int EditId = scanner.nextInt();
		System.out.println("Select Edit Values\n1.Id\n2.Name\n3.Marks\n4.Course");
		for (Student student : set) {
			if (student.id == EditId) {
				status = false;
				System.out.print("Enter the Choice :");
				int key = scanner.nextInt();
				switch (key) {
				case 1:
					System.out.print("Enter the New Id :");
					int enterId = scanner.nextInt();
					if (set.stream().allMatch(std -> std.id == enterId)) {
						System.out.println("Id Already Exist");

					} else {
						student.id = enterId;
						System.out.println("!!--Successfully id edited--!!");
					}
					break;
				case 2:
					System.out.print("Enter Student Name :");
					student.name = scanner.next();
					System.out.println("!!--Successfully name edited--!!");
					break;
				case 3:
					System.out.print("Enter Student Marks :");
					student.marks = scanner.nextInt();
					System.out.println("!!--Successfully Marks edited--!!");
					break;
				case 4:
					System.out.print("Enter Student Course :");
					student.course = scanner.next();
					System.out.println("!!--Successfully Course edited--!!");
					break;
				default:
					System.out.println("Enter Valid Option");
					break;
				}
				System.out.println("=======================");
				break;
			}
		}
		if (status) {
			System.out.println("Id Doesn't Exit");
		}
	}
}
