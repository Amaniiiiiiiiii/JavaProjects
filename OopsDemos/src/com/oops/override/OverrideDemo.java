package com.oops.override;

public class OverrideDemo {

	public static void main(String[] args) {

		Shaper shaper=new Triangle();// super class reference which is referring to sub class here sub class is getting highest priority
		shaper.area(12, 45);
		shaper.greet();
		
		shaper=new Rectangle();
		shaper.area(10, 20);
		shaper.greet();
	}

}
