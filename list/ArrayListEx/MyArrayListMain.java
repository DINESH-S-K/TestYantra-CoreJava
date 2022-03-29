package com.tyss.list.ArrayListEx;

public class MyArrayListMain {
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList(2);
		myArrayList.add(10);
		myArrayList.add(20);
		myArrayList.add(30);
		myArrayList.add(40);
		System.out.println(myArrayList);
		
        System.out.println(myArrayList.position(1));
     	
     	myArrayList.remove(3);
     	myArrayList.print();
	}
	
}
