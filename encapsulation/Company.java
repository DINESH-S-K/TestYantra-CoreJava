package com.tyss.encapsulation;

public class Company {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Dinesh");
		employee.setAge(20);
		employee.setDesignation("Intern");
	    employee.setSalary(56334);
	    
	    System.out.println(employee.getName());
	    System.out.println(employee.getAge());
	    System.out.println(employee.getDesignation());
	    System.out.println(employee.getSalary());
	}

}
