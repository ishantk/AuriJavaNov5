package com.auribises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Student{
	int roll;
	String name;
	
	public String toString() {
		return roll+" \t "+name;
	};
}

public class ListDemo {

	public static void main(String[] args) {
		
		//List list1 = new ArrayList();
		ArrayList list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Student> list3 = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "John";
		
		Student s2 = new Student();
		s2.roll = 201;
		s2.name = "Fionna";

		
		// 1. Add Operation
		//list1.add(0,"Sia"); 	//0
		list1.add("Sia"); 		//0
		list1.add(10);			//1
		list1.add(2.2);			//2
		list1.add(s1);			//3
		list1.add("Fionna");	//4
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("John");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("John");
		list2.add("Joe");
		//list2.add(100);  err
		//list2.add(s1);   err
		
		list3.add(s1);
		list3.add(s2);
		//list3.add("Joe"); err 
		//list3.add(100);   err
		
		//2. View Data
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		//3. Get Single Object from List
		Object o = list1.get(2);
		String name = list2.get(1);
		Student sRef = list3.get(0);
		
		System.out.println(o);
		System.out.println(name);
		System.out.println(sRef);
		
		System.out.println();
		
		System.out.println(list2);
		//4. Update Object
		list2.set(1, "George");
		System.out.println(list2);
		
		//5. Delete Operation
		list2.remove(1);
		System.out.println(list2);
		
		//6. Length/Size of List
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		
		//7. Loop or iterate in the list
		System.out.println("===For Loop===");
		for(int i=0;i<list2.size();i++){
			String s = list2.get(i);
			System.out.println(s);
		}
		System.out.println("===Enhanced For Loop===");
		for(String s : list2){
			System.out.println(s);
		}
		System.out.println("===Iterator===");
		Iterator<String> itr = list2.iterator();
		/*System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());*/
		
		while(itr.hasNext()){
			String s = itr.next();
			System.out.println(s);
			if(s.equals("Jim")){
				itr.remove();
			}
		}
		
		System.out.println(list2);
		
		System.out.println("===List Iterator===");
		ListIterator<String> listItr = list2.listIterator();
		while(listItr.hasNext()){
			String s = listItr.next();
			System.out.println(s);
			/*if(s.equals("Jim")){
				listItr.remove();
			}*/
		}
		
		System.out.println();
		
		while(listItr.hasPrevious()){
			String s = listItr.previous();
			System.out.println(s);
		}
		
		//8. Clear the list
		//list2.clear();
		//System.out.println(list2);
		
		if(list2.contains("John")){
			System.out.println("John is in the list");
		}
		
		int idx = list2.indexOf("John");
		System.out.println("idx is: "+idx);
		
		idx = list2.lastIndexOf("John");
		System.out.println("idx is: "+idx);
	
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		
		
		// Sort a list of Student Objects based on roll number
		// Comparator API
		
		// THREAD-SAFE version of ArrayList
		Vector<String> vector = new Vector<String>();
		vector.add("John");
		vector.add("Jennie");
		vector.add("John");
		vector.add("Jim");
		vector.add("John");
		vector.add("Jack");
	}
	

}
