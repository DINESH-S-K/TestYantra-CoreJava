package com.tyss.collection.list.ArrayListEx;

public class MyArrayListMain {
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList(2);
		myArrayList.add(10);
		myArrayList.add(20);
		myArrayList.add(30);
		
		System.out.println(myArrayList.position(2));
		myArrayList.print();
	}
	
}
