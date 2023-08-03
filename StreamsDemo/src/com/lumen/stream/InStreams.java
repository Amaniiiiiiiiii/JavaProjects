package com.lumen.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.*;

public class InStreams {

	public static void main(String[] args) {
		
		List<String> courses=Arrays.asList("Java","Angular","Angular","Node","Spring","CSS","React");
		
		//convert to stream 
		
		Iterator<String> iterator=courses.stream()
										  .filter(str->str.length()>4)
										  .skip(2)
										  .iterator();
		while(iterator.hasNext()) {
			String cname=iterator.next();
			System.out.println(cname);
		}
		
		System.out.println();
		courses.stream()
		       .filter(str->str.length()>4)
		       .distinct()
		       .limit(2)
				.forEach(str->System.out.println(str.toUpperCase()));
		
		
		System.out.println();
		List<Integer> ncourses=courses.stream()
				.sorted()
				.map(str->str.length())
				.filter(num->num>5)
				.collect(Collectors.toList()); //convert into a list
		
		ncourses.forEach(num->System.out.println(num));
		
		
		//convert list to stream and use map to get length and 
		//use filter to check if divisible by 2
		//print only that values
		
		System.out.println();
		
		List<Integer> coursess=courses.stream()
				.map(str->str.length())
						.filter(str->(str%2==0))
						.collect(Collectors.toList());
			coursess.forEach(str->System.out.println(str));
			
			
			
	}
}
