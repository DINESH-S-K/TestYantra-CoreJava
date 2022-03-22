package com.assignment.corejava;

public class Company {
	public static void main(String[] args) {
		Manager manager = new Manager("Dinesh",20, 6369073734l, "Salem,TN", 60000, "Software");
		System.out.println(manager.Name);
		System.out.println(manager.Age);
		System.out.println(manager.Phone_Number);
		System.out.println(manager.Address);
		System.out.println(manager.Salary);
		manager.printSalary();
		System.out.println(manager.department);
		
		System.out.println("=========================================");
		Employee employee = new Employee("Gokul", 20, 7685930392l, "Cuddlore,TN", 70000,"Hardware");
		System.out.println(employee.Name);
		System.out.println(employee.Age);
		System.out.println(employee.Phone_Number);
		System.out.println(employee.Address);
		System.out.println(employee.Salary);
		employee.printSalary();
		System.out.println(employee.specialization);
		
	}

}
