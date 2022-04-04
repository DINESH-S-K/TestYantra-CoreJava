package com.tyss.finalAssessment;

import java.util.Iterator;
import java.util.Set;

public class ListOfStudents {
	public void listOfStudents(Set<Student> set) {
		System.out.println("====================");
		System.out.println("List of Student Details");
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("!!--Successfully Showed--!!");
		System.out.println("====================");
	}
}