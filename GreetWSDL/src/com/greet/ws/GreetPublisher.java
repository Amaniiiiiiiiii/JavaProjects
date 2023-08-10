package com.greet.ws;

import javax.xml.ws.Endpoint;

public class GreetPublisher {
public static void main(String[] args) {
	IGreeterService greeterService=new GreeterServiceImpl();
	Endpoint.publish("http://localhost:8081/greeterService", greeterService);
	
	
	
}
}
