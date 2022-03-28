package com.tyss.collection.list.ArrayListEx.ListOfObjects;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	String designation;
	double salary;

	public Employee(int id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	public int compareTo(Employee o) {
		System.out.println(this.id + " " + o.id);
		return this.id - o.id; // increasing order.
//		return -(this.id -  o.id); // decreasing order.
//		return o.id  - this.id;  // decreasing order.

	}

}
