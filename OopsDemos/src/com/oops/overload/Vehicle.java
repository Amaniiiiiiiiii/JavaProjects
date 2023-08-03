package com.oops.overload;

public class Vehicle {

	String model;
	String brand;
	double price;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(String model) {
		this();
		this.model = model;

	}

	public Vehicle(String model, double price) {
		this(model);
		this.price = price;
		
	}

	public Vehicle(String model, String brand, double price) {
		this(model,price);
		this.brand = brand;
		
	}
	
	void print() {
		if(model!=null)
		    System.out.println("Model "+model);
		if(brand!=null)
			System.out.println("Brand "+brand);
		if(price>0)
			System.out.println("Price "+price);
	}
	
	
	
}
