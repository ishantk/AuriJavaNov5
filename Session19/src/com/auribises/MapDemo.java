package com.auribises;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "John");
		map.put(345, "Jennie");
		map.put(111, "John");
		map.put(987, "Jim");
		map.put(654, "John");
		map.put(139, "Jack");
		map.put(null, "Sia");
		map.put(121, null);
		
		System.out.println(map);
		
		map.put(111, "Fionna");
		
		System.out.println(map);
		
		String name = map.get(111);
		System.out.println(name);
		
		map.remove(111);
		//map.clear();
		
		if(map.containsKey(139)){
			System.out.println("139 is in the map");
		}
		
		if(map.containsValue("Sia")){
			System.out.println("Sia is in the map");
		}
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			
			System.out.println(key+"\t"+value);
		}
		
		
		// THREAD-SAFE + no null key and no null values
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();

		// Sorting with Comparator !!
		
	}

}
