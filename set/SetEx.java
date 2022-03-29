package com.tyss.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(10);
		hashSet.add(30);// returns boolean value . duplicate means false.
		hashSet.add(40);
		hashSet.add(30);

		// System.out.println(hashSet);
		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
        System.out.println("=============================");
        System.out.println("Maintain insertion order"); 
		LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(50);
		linkedHashSet.add(20);
		linkedHashSet.add(10);
		linkedHashSet.add(30);
		linkedHashSet.add(40);
		linkedHashSet.add(50);
		linkedHashSet.add(40);
		
		Iterator<Object> iterator1 = linkedHashSet.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
			
		System.out.println("======================================");
		System.out.println("Sort");
		TreeSet<Object> treeSet = new TreeSet<>();
		treeSet.add(30);
		treeSet.add(20);
		treeSet.add(10);
		treeSet.add(30);
		treeSet.add(50);
		treeSet.add(40);
		treeSet.add(40);
		
		Iterator<Object> iterator2 = treeSet.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		}
	}
