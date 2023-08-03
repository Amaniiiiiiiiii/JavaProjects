package com.oops.override;

public class Rectangle extends Shaper {

	@Override
	void area(int x, int y) {
		System.out.println("Area of rectangle "+(x*y));
}
	@Override//source override method
	void greet() {
		System.out.println("Hello");//whatever is common in sub class and super class only can be called 
	}
	
}
