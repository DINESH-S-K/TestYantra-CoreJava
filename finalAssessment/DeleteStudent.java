package finalAssessment;

import java.util.Scanner;
import java.util.Set;

public class DeleteStudent {
	public void deleteStudent(Set<Student> set, Scanner scanner) {
		System.out.println("====================");
		System.out.print("Enter Student Id for Delete :");
		int deleteId = scanner.nextInt();
		boolean status = true;
		for (Student student : set) {
			if (student.id == deleteId) {
				status = false;
				set.remove(student);
				System.out.println("!!--Successfully Deleted--!!");
				break;
			}
		}
		if (status) {
			System.out.println("Id Doesn't Exit");
		}
		System.out.println("====================");
	}
}
