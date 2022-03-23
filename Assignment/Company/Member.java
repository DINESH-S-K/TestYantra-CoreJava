package com.assignment.corejava.Company;

public class Member {
 String Name;
 int Age;
 long Phone_Number;
 String Address;
 int Salary;

 public Member(String name, int age, long phone_Number, String address, int salary) {
	Name = name;
	Age = age;
	Phone_Number = phone_Number;
	Address = address;
	Salary = salary;
}

public void printSalary() {
	 System.out.println("Salary :" + Salary);
 }
}





