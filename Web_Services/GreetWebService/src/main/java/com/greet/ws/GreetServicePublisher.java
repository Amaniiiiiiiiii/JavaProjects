package com.greet.ws;

import javax.xml.ws.Endpoint;

public class GreetServicePublisher {
	public static void main(String[] args) {
		
	
	IGreetService greetService= new GreetServiceImpl();
	
	String address="http://localhost:8083/greetservice";
	Endpoint.publish(address, greetService);
	System.out.println("Service published");
}
}