package finalAssessment;

import java.util.Scanner;
import java.util.Set;

public class AddStudent {
	int id;
	String name;
	int marks;
	String course;

	void addStudent(Set<Student> set, Scanner scanner) {
		System.out.println("====================");
		System.out.print("Enter the Number of students to be added :");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter Student Id :");
			id = scanner.nextInt();
			System.out.print("Enter Student Name :");
			name = scanner.next();
			System.out.print("Enter Student Marks :");
			marks = scanner.nextInt();
			System.out.print("Enter Student Course :");
			course = scanner.next();
			set.add(new Student(id, name, marks, course));
			System.out.println("====================");
		}
		System.out.println("!!--Successfully Added--!!");
	}
}
