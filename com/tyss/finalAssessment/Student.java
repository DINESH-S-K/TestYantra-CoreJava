package com.tyss.finalAssessment;

public class Student {
	int id;
	String name;
	int marks;
	String course;

	public Student(int id, String name, int marks, String course) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

//	Object object = new Student();
//	Up casting internally.
	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj; // DownCasting
		return this.id == std.id;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getMarks() {
		return this.marks;
	}

	public String getCourse() {
		return this.course;
	}

}
