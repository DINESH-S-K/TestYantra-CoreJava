package com.assignment.list.LinkedListEx;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Object> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);;
		linkedList.add(4.56);
		linkedList.add('c');
		linkedList.add("string");
		linkedList.add(null);
		
		List<Object> list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		LinkedList<Object> linkedList2 = new LinkedList<>();
		linkedList2.add(100);
		linkedList2.add(200);
		
		System.out.println("Initial LinkedList" + linkedList);
		System.out.println("Initial LinkedList" + list);
		System.out.println("Initial LinkedList" +linkedList2);
		
		linkedList.addAll(list);
		System.out.println("Add all" + linkedList);
		linkedList.removeAll(linkedList2);
		System.out.println("Remove all" +linkedList);
		
		//System.out.println(linkedList);
	}

}
