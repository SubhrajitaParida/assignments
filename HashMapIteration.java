//Q.Write a program to show the behavior of HashMap using different ways of iterations?

package com.crnts.dec5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {
	public static void main(String[] args) {
		Student student1 = new Student("Varsha", 10);
		Student student2 = new Student("Varshini", 11);
		Student student3 = new Student("Shivani", 12);
		Student student4 = new Student("Bharathi", 13);
		Student student5 = new Student("Nandini", 14);

		HashMap<Integer, Student> hashMap = new HashMap<>();
		hashMap.put(student1.getId(), student1);
		hashMap.put(student2.getId(), student2);
		hashMap.put(student3.getId(), student3);
		hashMap.put(student4.getId(), student4);
		hashMap.put(student5.getId(), student5);
        
		
		System.out.println(hashMap);
		System.out.println("=================================================================");
		Collection<Student> collections=hashMap.values();
		System.out.println(collections);
		System.out.println("==================================================================");
		Set<Entry<Integer,Student>> set=hashMap.entrySet();//using entrySet() displaying the value
		System.out.println(set);
	}
}
