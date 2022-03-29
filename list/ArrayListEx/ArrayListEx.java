package com.tyss.list.ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
public static void main(String[] args) {
	ArrayList<Object> arrayList = new ArrayList<>();
	arrayList.add(10);
	arrayList.add(20);
	arrayList.add(4.56);
	arrayList.add('c');
	arrayList.add("string");
	arrayList.add(null);
	
	List<Object> list = new ArrayList<Object>();
	list.add(100);
	list.add(200);
	list.add(300);
	list.add(400);
	
	ArrayList<Object> arrayList2 = new ArrayList<>();
	arrayList2.add(100);
	arrayList2.add(200);
	
	System.out.println("Initial array" + arrayList);
	System.out.println("Initial array" + list);
	System.out.println("Initial array" +arrayList2);
	
	arrayList.addAll(list);
	System.out.println("Add all" + arrayList);
	arrayList.removeAll(arrayList2);
	System.out.println("Remove all" +arrayList);
	arrayList.remove(1);
	System.out.println("Remove :" + arrayList);
	
	
	
}
}
