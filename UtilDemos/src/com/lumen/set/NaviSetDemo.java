package com.lumen.set;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NaviSetDemo {

	public static void main(String[] args) {

		NavigableSet<String> set = new TreeSet<>(Arrays.asList("Apple","Orange","Mango","Grapes"));
		System.out.println(set);
		System.out.println(set.descendingSet());
		
		//headset
		SortedSet<String> headData=set.headSet("Mango");
		System.out.println(headData);
		
		SortedSet<String> headData1=set.headSet("Mango",true);
		System.out.println(headData1);
		
		//tailset
		SortedSet<String> tailData=set.headSet("Grapes");
		System.out.println(tailData);
		
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.floor("Grapes"));//return grapes
		System.out.println(set.floor("Grape"));//return apple
		
		System.out.println(set.ceiling("Grapes"));//return grapes

		System.out.println(set.ceiling("Ora"));//return mango
		
	}

}
