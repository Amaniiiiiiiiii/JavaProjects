package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public class BookServiceImpl implements IBookService{

	@Override
	public void addBook(Book book) {
		
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		//create a temp
		//iterate check
		return null;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
