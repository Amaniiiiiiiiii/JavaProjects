package com.oops.overload;

public class VarargsDemo {
	
	void calcSum(String name,int... marks) {
		System.out.println("Welcome"+ name);
		int sum=0;
		for(int mark:marks) {
			sum+=mark;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		VarargsDemo demo= new VarargsDemo();
		demo.calcSum("Amani", 90,80,90);
		demo.calcSum("Alpha");
		demo.calcSum("Roni", 90,80,90,98);
		

	}

}
