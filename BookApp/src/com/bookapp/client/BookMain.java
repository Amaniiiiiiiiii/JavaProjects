package com.bookapp.client;
import com.bookapp.util.*;

import com.bookapp.exception.*;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

import java.util.ArrayList;
import java.util.List;


public class BookMain  {

	public static void main(String[] args) throws BookNotFoundException {
		IBookService bookservice=new BookServiceImpl();
		List<Book> books=new ArrayList<>();
		books=bookservice.getAll();
		System.out.println(books);
		
		books=bookservice.getByAuthorContains("Ben john");
		System.out.println(books);
		
		books=bookservice.getByCategory("Tech");
		System.out.println(books);
		
		
	}

}
