package com.bookapp.util;

import java.util.Arrays;
import java.util.List;
import com.bookapp.model.Book;

public class BookDetails {

	public static List<Book> showBooks(){
		return Arrays.asList(
				new Book("Java in Action","John David","tech",1,900),
				new Book("5 am club","Robin sharma","Selfhelp",2,300),
				new Book("HTML for dummies","Ben John","Tech",3,1900),
				new Book("Secret Seven","Enid ben","Fiction",4,700.09),
				new Book("Seven Habits","John Hopper","Selfhelp",5,800.56)
				
				);
	}
}
