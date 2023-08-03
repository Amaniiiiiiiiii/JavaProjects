package com.api.lang;

public class HashMain {
	public static void main(String[] args) {
		//if title and isbn numbr are same then they are same objects
		Book book1=new Book("HeadFirst Java","Kathy",18723456L);
		Book book2=new Book("HeadFirst Java","John",18723456L);
		Book book3=new Book("Java","Kathy",218723456L);
		System.out.println("1 and 2 "+book1.equals(book2));
		System.out.println("1 and 3 "+book1.equals(book3));
		System.out.println("1 hash "+book1.hashCode());
		System.out.println("2 hash "+book2.hashCode());
		System.out.println("3 hash "+book3.hashCode());
	}
}
