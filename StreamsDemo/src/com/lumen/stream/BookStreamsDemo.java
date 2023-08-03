package com.lumen.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookStreamsDemo {

	public static void main(String[] args) {
//		//create list of books->convert to stream->get books by author-.print
//		 List<Book> books = Arrays.asList(
//					new Book("Java in Action","John David","tech",1,900),
//					new Book("5 am club","Robin sharma","Selfhelp",2,300),
//					new Book("HTML for dummies","Ben John","Tech",3,1900),
//					new Book("Secret Seven","Enid ben","Fiction",4,700.09),
//					new Book("Seven Habits","John Hopper","Selfhelp",5,800.56)
//					);
//		 
//	books.stream()
//	      .filter( book ->book.getAuthor().equals("Ben John"))
//	      .map(book->book.getTitle())
//	      .forEach(book->System.out.println(book));
//	
	//create list of books->convert to stream->get only title->get length of each title and square it and convert to list
	
	 List<Book> books = Arrays.asList(
				new Book("Java in Action","John David","tech",1,900),
				new Book("5 am club","Robin sharma","Selfhelp",2,300),
				new Book("HTML for dummies","Ben John","Tech",3,1900),
				new Book("Secret Seven","Enid ben","Fiction",4,700.09),
				new Book("Seven Habits","John Hopper","Selfhelp",5,800.56)
				);
	 

List<Integer>booklength =books.stream()
   .filter( book ->book.getAuthor().equals("Ben John"))
   .map(book->book.getTitle().length())
   .map(square->(int)Math.pow(square, 2))
   .collect(Collectors.toList());
	
booklength.forEach(square->System.out.println(square));
	
	}
	
}
