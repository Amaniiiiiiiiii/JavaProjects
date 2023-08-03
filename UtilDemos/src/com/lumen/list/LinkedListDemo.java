package com.lumen.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> linkedlist=new LinkedList<>();
		System.out.println(linkedlist.size());
		linkedlist.add("Java");
		linkedlist.add("100");
		linkedlist.add("100.9");
//		linkedlist.add("Spring");
//		linkedlist.add("Maven");
//		linkedlist.add("Angular");
//		linkedlist.add(1,"Helen");
//		linkedlist.addFirst("Html");
		linkedlist.addLast("CSS");
		System.out.println(linkedlist);
		linkedlist.set(1,"react");
		System.out.println(linkedlist);
		
		linkedlist.set(2, "Priya");
		System.out.println(linkedlist.size());
		
		Iterator<String> iterator=linkedlist.iterator();
		while(iterator.hasNext()) {
			String name=iterator.next();
			System.out.println(name.toLowerCase());
		}
		Collections.sort(linkedlist);
		System.out.println(linkedlist);
		
		for(String name:linkedlist) {
//			String str=(String)obj;
//			System.out.println(str);
			System.out.println(name.toUpperCase());
		}
			System.out.println(linkedlist.size());
			linkedlist.set(1, "Lucky");
			linkedlist.add(2,"Buddy");
			System.out.println(linkedlist.get(2));
			
		
			System.out.println("Reverse");
			ListIterator<String> linkedlistIterator=linkedlist.listIterator(linkedlist.size());
			while(linkedlistIterator.hasPrevious()) {
				//String name=linkedlistIterator.previous();
System.out.println(linkedlist.poll());
System.out.println(linkedlist);
System.out.println(linkedlist.poll());
System.out.println(linkedlist.poll());
System.out.println(linkedlist.peek());
System.out.println(linkedlist);


System.out.println(linkedlist.remove());
				
				
	}

	}}
