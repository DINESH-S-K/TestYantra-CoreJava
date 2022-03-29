package com.tyss.list.ArrayListEx;

import java.util.Arrays;

public class MyArrayList {

	private Object[] array;
	private int size = 10;
	int position;

	public MyArrayList() {
		array = new Object[size];
	}

	public MyArrayList(int size) {
		this.size = size;
		array = new Object[size];
	}

	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + ", size=" + size + "]";
	}

	public void add(Object obj) {
		if (position >= size) {
			increaseCapacity();
		}
		array[position] = obj;
		position++;
	}

	private void increaseCapacity() {
		System.out.println("Size is increased");
		this.size = ((size * 3) / 2) + 1;
		Object[] temp = new Object[size];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	public void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public Object position(int index) {
		return array[index];

	}

	public void remove(int index) {
		for (int i = 0; i < size; i++) {
           if(i>=index) {
        	   array[i] = array[i+1];
           }
		}
	}

}
