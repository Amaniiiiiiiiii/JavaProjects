package com.oops.basics;

public class Book {
	String title;
	String author;
	int price;
	
	public Book (String title,String author, int price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	void printDetails() {
		System.out.println("Book name is:"+ title);
		System.out.println("Book author is:"+ author);
		System.out.println("Book price is:"+ price);
	}
	
	double getDiscountedPrice(double amount) {
		System.out.println("Discounted price is "+ amount);
		return (price-amount);
		
	}

}
