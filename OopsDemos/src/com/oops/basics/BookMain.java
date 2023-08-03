package com.oops.basics;

public class BookMain {


	public static void main(String[] args) {
        Book book=new Book("Hunger games", "XYZ",1000);
//        b1.title="Hunger games";
//        b1.author="XYZ";
//        b1.price=1000;
        book.printDetails();
        double total=book.getDiscountedPrice(300);
        System.out.println("Final price is:"+ total);
	}

}
