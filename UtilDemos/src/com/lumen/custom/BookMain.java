package com.lumen.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		Book book1=new Book("Hunger games","Author1",1000);
		Book book2=new Book("Mockingbird","Author2",1300);
		Book book3=new Book("How to get away with murder","Author3",980);
		Book book4=new Book("How to get away","Author1",980);
		
		List<Book> bookList= new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		System.out.println("List of Books");
		Iterator<Book> iterator=bookList.iterator();
		while(iterator.hasNext()) {
			Book bookname=iterator.next();
			System.out.println(bookname);
		}

		//System.out.println(bookList);
		String authorName="Author1" ;
		List<Book> booksByAuthor= new ArrayList<Book>();
		for(Book book:bookList) {
			if(book.getAuthor().equals(authorName)) {
				booksByAuthor.add(book);
		}
		
			
		}
		for(Book author:booksByAuthor) {
		System.out.println("Books by author :" +authorName + author);
	}
		
		System.out.println("Before sorting");
		for(Book book:bookList) {
			System.out.println(book);
		}
		Collections.sort(bookList);
		
		System.out.println("After sorting");
		for(Book book:bookList) {
			System.out.println(book);
}
}
}
