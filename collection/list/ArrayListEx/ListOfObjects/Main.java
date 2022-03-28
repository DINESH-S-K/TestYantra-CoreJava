package com.tyss.collection.list.ArrayListEx.ListOfObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Employee Dinesh = new Employee(3, "Dinesh", "Trainee", 60000);
		Employee Gokul = new Employee(1, "Gokul", "Trainee", 35000);
		Employee Nallish = new Employee(2, "Nallish", "Trainee", 30000);
		Employee Mukilan = new Employee(5, "Mukilan", "Trainee", 40000);
		Employee Naveen = new Employee(4, "Naveen", "Trainee", 70000);

		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(Dinesh);
		arrayList.add(Gokul);
		arrayList.add(Nallish);
		arrayList.add(Mukilan);
		arrayList.add(Naveen);

//	System.out.println(arrayList);

//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}
//		for (Employee employee : arrayList) {
//			System.out.println(employee);
//		}
//      Dinesh.compareTo(Gokul);

//      Collections.sort(arrayList);//Calling CompareTo in Comparable.
		
		
//		System.out.println("Sort By ID :");
//		SortById sortById = new SortById();
//		Collections.sort(arrayList, sortById);
//		Iterator<Employee> iterator = arrayList.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		System.out.println("=====================================");
//		System.out.println("Sort By Name");
//		SortByName sortByName = new SortByName();
//		Collections.sort(arrayList, sortByName);
//		Iterator<Employee> iterator1 = arrayList.iterator();
//		while (iterator1.hasNext()) {
//			System.out.println(iterator1.next());
//		}
		System.out.println("1.Id\n2.Name \n3.Salary");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sort Method :");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("Sort By ID :");
			SortById sortById = new SortById();
			Collections.sort(arrayList, sortById);
			Iterator<Employee> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			break;
		case 2:
			System.out.println("Sort By Name :");
			SortByName sortByName = new SortByName();
			Collections.sort(arrayList, sortByName);
			Iterator<Employee> iterator1 = arrayList.iterator();
			while (iterator1.hasNext()) {
				System.out.println(iterator1.next());
			}
			break;
		case 3:
			System.out.println("Sort By Salary :");
			SortBySalary sortBySalary = new SortBySalary();
			Collections.sort(arrayList, sortBySalary);
			Iterator<Employee> iterator2 = arrayList.iterator();
			while (iterator2.hasNext()) {
				System.out.println(iterator2.next());
			}
			break;
			

		default:
			break;
		}
			
		}
		
	}
