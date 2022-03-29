package com.tyss.set.setEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;

public class Main {
	public static void main(String[] args) {

		Student dinesh = new Student(2, "Dinesh", "Cse");
		Student gokul = new Student(4, "Gokul", "Civil");
		Student nallish = new Student(1, "Nallish", "EEE");
		Student dinesh2 = new Student(1, "Dinesh", "EEE");
		Student mahesh = new Student(3, "mahesh", "Cse");
		Student mahesh2 = new Student(3, "mahesh", "Cse");
		Student mahesh3 = new Student(4, "mahesh", "Cse");

		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(dinesh);
		hashSet.add(gokul);
		hashSet.add(nallish);
		hashSet.add(dinesh2);
		hashSet.add(mahesh);
		hashSet.add(mahesh2);
		hashSet.add(mahesh3);
	
		ArrayList<Student> arrayList = new ArrayList<>(hashSet);
		
		Collections.sort(arrayList,new SortById());
		Iterator<Student> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("=====================================");
		
		Collections.sort(arrayList,new SortByName());
		Iterator<Student> iterator2 = arrayList.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		
//		for (Student student : hashSet) {
//		System.out.println(student);
//	}
//	
		
//
//		System.out.println("======================================");
//		System.out.println("Maintain Insertion Order");
//
//		LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
//		linkedHashSet.add(dinesh);
//		linkedHashSet.add(gokul);
//		linkedHashSet.add(nallish);
//		linkedHashSet.add(dinesh2);
//		linkedHashSet.add(mahesh);
//		linkedHashSet.add(mahesh2);
//		linkedHashSet.add(mahesh3);
//
//		Iterator<Student> iterator1 = linkedHashSet.iterator();
//		while (iterator1.hasNext()) {
//			System.out.println(iterator1.next());
//		}
//		System.out.println("======================================");
	}
}
