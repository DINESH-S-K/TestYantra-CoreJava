package com.tyss.finalAssessment;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;

public class Sorting {
	public void sorting(Set<Student> set,Scanner scanner) {
	System.out.println("====================");
	System.out.println("1.Sort By Id\n2.Sort By Name\n3.Sort By Marks\n4.Sort By Course");
	System.out.print("Select options :");
	int options = scanner.nextInt();
	switch (options) {
	case 1:
		set.stream().sorted(Comparator.comparing(Student::getId)).forEach(System.out::println);
		System.out.println("!!--Successfully Sorted by Id--!!");
		System.out.println("====================");
		break;
	case 2:
		set.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
		System.out.println("!!--Successfully Sorted by Name--!!");
		System.out.println("====================");
		break;
	case 3:
		set.stream().sorted(Comparator.comparing(Student::getMarks)).forEach(System.out::println);
		System.out.println("!!--Successfully Sorted by Marks--!!");
		System.out.println("====================");
		break;
	case 4:
		set.stream().sorted(Comparator.comparing(Student::getCourse)).forEach(System.out::println);
		System.out.println("!!--Successfully Sorted by Course--!!");
		System.out.println("====================");
		break;	
	default:
		System.out.println("Enter Correct Option");
		break;
	}
	}
}
