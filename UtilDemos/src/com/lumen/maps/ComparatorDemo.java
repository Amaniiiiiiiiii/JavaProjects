package com.lumen.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorDemo {

	public static void main(String[] args) {

		Vehicle vehicle1=new Vehicle("A100","BMW",200000);
		Vehicle vehicle2=new Vehicle("Santro","Hyundai",300000);
		Vehicle vehicle3=new Vehicle("Swift","Maruti Suzuki",230000);
		Vehicle vehicle4=new Vehicle("auto","Volkswagen",1000000);
		
		List<Vehicle> vehicleList= new ArrayList<>();
		vehicleList.add(vehicle1);
		vehicleList.add(vehicle2);
		vehicleList.add(vehicle3);
		vehicleList.add(vehicle4);
		
		System.out.println("List of Vehicles");
		Comparator<Vehicle> comparator = new BrandSort();
		Collections.sort(vehicleList,comparator);
		for(Vehicle vehicle:vehicleList) {
			System.out.println(vehicle);
		}
	
		System.out.println("List of Models");
		Comparator<Vehicle> comparator1 = new ModelSort();
		Collections.sort(vehicleList,comparator1);
		for(Vehicle vehicle0:vehicleList) {
			System.out.println(vehicle0);
		}
				System.out.println("List of Prices");
			Comparator<Vehicle> comparator2 = new PriceSort();
			Collections.sort(vehicleList,comparator2);
			for(Vehicle vehiclea:vehicleList) {
				System.out.println(vehiclea);
		
		
	}

}
}
