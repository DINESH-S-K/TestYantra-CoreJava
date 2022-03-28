package com.tyss.collection.list.ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
public static void main(String[] args) {
	ArrayList arrayList = new ArrayList();
	arrayList.add(10);
	arrayList.add(20);
	arrayList.add(4.56);
	arrayList.add('c');
	arrayList.add("string");
	arrayList.add(null);
	
	List list = new ArrayList();
	list.add(100);
	list.add(200);
	list.add(300);
	list.add(400);
	
	ArrayList arrayList2 = new ArrayList();
	arrayList2.add(100);
	arrayList2.add(200);
	
	System.out.println("Initial array" + arrayList);
	System.out.println("Initial array" + list);
	System.out.println("Initial array" +arrayList2);
	
	arrayList.addAll(list);
	System.out.println("Add all" + arrayList);
	arrayList.removeAll(arrayList2);
	System.out.println("Remove all" +arrayList);
	
	
	
}
}
