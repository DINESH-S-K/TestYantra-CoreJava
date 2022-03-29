package com.assignment.list.ArrayListEx;

public class CompareToInString implements Comparable<CompareToInString> {
	int id;
	String name;
	String designation;
	double salary;

	public CompareToInString(int id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(CompareToInString o) {
		return this.name.compareTo(o.name);
	}
//		@Override
//		public ArrayList remove(int index) {
//			for(int i =0; i < )
//		}

}
