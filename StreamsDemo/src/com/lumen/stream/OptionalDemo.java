package com.lumen.stream;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
 Optional<String> courseOptional=Arrays.asList("Java","Angular","Node","Spring")
		 .stream()
		 .filter(str->str.length()>1)
		 .findFirst();//returns the optional
 
 if(courseOptional.isPresent())
	 System.out.println(courseOptional.get());
 
 if(!courseOptional.isEmpty()) {
	 System.out.println(courseOptional.get());
 		courseOptional.ifPresent(System.out::println);
 }
 
 String cname=Arrays.asList("Java","Angular","Node","Spring")
		 .stream()
		 .filter(str->str.length()>1)
		 .findFirst()
		// .get() //if no value throws exception
		 //.orElse("No Course");//if value present return it or return the value in orElse
		 .orElseThrow(()->new RuntimeException("No values Present"));
	}
}
