package com.assignment.corejava.Student_Constructor;

public class StudentConstructor {
public static void main(String[] args) {
	Student student = new Student();
	System.out.println("Student Name :" + student.Student_name);
	Student student2 = new Student("Dinesh");
	System.out.println("Student Name :" + student2.Student_name);
}
}
