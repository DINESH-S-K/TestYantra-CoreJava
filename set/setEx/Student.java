package com.tyss.set.setEx;

public class Student {
	int roll_no;
	String name;
	String dept;

	public Student(int roll_no, String name, String dept) {
		this.roll_no = roll_no;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int hashCode() {
		return roll_no;
	}
	@Override
//	 Object obj = new Student() ; Upcasting internally. 
	public boolean equals(Object obj){
		Student std = (Student) obj; // DownCasting
		return this.roll_no==std.roll_no;
	}

}
