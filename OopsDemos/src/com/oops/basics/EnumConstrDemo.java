package com.oops.basics;



enum VehicleDetails{
	HONDA("CITY",900000),
	AUDI("A100",189002299),
	MAHINDRA("THAR",89098888),
	BMW("BMW 900",138652739);
	
	private String model;
	private double price;
	private VehicleDetails (String model, double price) {
		this.model=model;
		this.price=price;
		
	}
	public String getModel() {
		return model;
		
	}
	public double getPrice() {
		return price;
		
	}
	
}
public class EnumConstrDemo {

	public static void main(String[] args) {

		VehicleDetails vehicle=VehicleDetails.AUDI;
		System.out.println("Model "+vehicle.getModel());
		System.out.println("Price"+vehicle.getPrice());
		
		//double priceofHonda=VehicleDetails.HONDA.price;
		double priceofHond=VehicleDetails.HONDA.getPrice();
		System.out.println(priceofHond);
		String modelofHonda=VehicleDetails.HONDA.getModel();
		System.out.println(modelofHonda);
		//System.out.println(priceofHonda);
		
	}

}
