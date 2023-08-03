package com.lumen.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
 public static void main(String[] args) {
	
	 Set <String> hashSet= new LinkedHashSet<>();
	 hashSet.add("Apple");
	 hashSet.add("Mango");
	 hashSet.add("Strawberry");
	 hashSet.add("100");
	 hashSet.add("Banana");
	 hashSet.add("Apple");
	// hashSet.add(null);
	 System.out.println(hashSet);
	 System.out.println(hashSet);
	 
	 for(String element:hashSet) {
		 System.out.println(element);
	 }
}
}
