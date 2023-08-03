package com.oops.inher;

public class Electronics {
	String model;
	String brand;
	double price;
	
	public Electronics(String model, String brand,double price) {
		this.model=model;
		this.brand=brand;
		this.price=price;
		
	}
	
	void print() {
		System.out.println(model);
		System.out.println(brand);
		System.out.println(price);

	}
}
