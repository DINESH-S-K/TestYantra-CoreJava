package com.tyss.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map {
	public static void main(String[] args) {
		HashMap<String, Long> hashMap = new HashMap<>();

		hashMap.put("Dinesh", 6369073734l);
		hashMap.put("Naveen", 33353245524l);
		hashMap.put("Nallish", 8685654553l);

		// System.out.println(hashMap.get("Dinesh"));

		Set<String> keySet = hashMap.keySet();// return set of keys
		for (String name : keySet) {
			System.out.println(name + " " + hashMap.get(name));
		}

		System.out.println("======================================");

		Set<Entry<String, Long>> entrySet = hashMap.entrySet();
		
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry);
		}
//		Iterator<Entry<String, Long>> iterator = entrySet.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	}

}
