package com.oops.inher;

public class ElecMain {

	public static void main(String[] args) {
		Mobile mobile=new Mobile("Oppo", "A5", 13000);
		mobile.print();
		
		Laptop laptop=new Laptop("HP", "Zbook", 100000, "HDMI","USB","LAN","VGA");
		laptop.showPorts();
		laptop.print();
		
		
	}

}
