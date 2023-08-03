package com.oops.overload;

public class OverloadMain {

	public static void main(String[] args) {
     Shape shape= new Shape();
     shape.calcArea(10);
     shape.calcArea((int)2.0);
     int rect = (int)shape.calcArea(10, 20);
     System.out.println("Rect "+ rect);
     double tri= shape.calcArea((int)12.0, 4);
     System.out.println("Tri "+tri);
     
	}

}
