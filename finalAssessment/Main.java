package finalAssessment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int choice = 0;
			System.out.println("======Welcome Student Portal=====");
			System.out.println("*********\n1.Add Student\n2.Edit Student\n3.Delete Student\n4.List of Students"
					+ "\n5.Get Student Details\n6.Sort the Students\n7.Exit\n*********");
			Set<Student> set = new HashSet<Student>();
			System.out.println("Empty Student Set");
			do {
				System.out.print("Enter the Option :");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					new AddStudent().addStudent(set, scanner);
					break;
				case 2:
					new EditStudent().editStudent(set, scanner);
					break;
				case 3:
					new DeleteStudent().deleteStudent(set, scanner);
					break;
				case 4:
					new ListOfStudents().listOfStudents(set);
					break;
				case 5:
					new GetStudent().getStudent(set, scanner);
					break;
				case 6:
					new Sorting().sorting(set, scanner);
					break;
				case 7:
					break;
				default:
					System.out.println("Enter Valid Option");
					break;
				}
			} while (choice != 7);
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
		scanner.close();
		System.out.println("Program End...\nThank you");
	}
}
