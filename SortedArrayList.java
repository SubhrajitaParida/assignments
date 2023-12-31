//Q.Write program sort the Employee elements based on name or location from ArrayList.


package com.crnts.dec5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class SortedArrayList {
public static void main(String[] args) {
	ArrayList<Employee> arrayList=new ArrayList<>();
	arrayList.add(new Employee(1, "Ramesh"));
	arrayList.add(new Employee(2, "Tajesh"));
	arrayList.add(new Employee(3, "Rakesh"));
	arrayList.add(new Employee(4, "Kamlesh"));
	//Using TreeSet we can sort the ArrayList Objects
	TreeSet<Employee> set=new TreeSet<>(arrayList);
	System.out.println(set);
	System.out.println("=============================================================================");
	
	//Using sort method also we can sort the ArrayList
   Collections.sort(arrayList);
   System.out.println(arrayList);
	
}
}
