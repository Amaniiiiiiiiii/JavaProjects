package com.oops.inher;

public class Mobile extends Electronics {
	double price;

	public Mobile(String model, String brand, double price) {
		super(model, brand, price);
		this.price = price;
	}

	void cameraType(String cam) {
		System.out.println(cam);

	}

}
