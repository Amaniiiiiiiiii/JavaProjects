package com.greet.ws;

import javax.jws.WebService;

@WebService(endpointInterface="IGreeterService")
public class GreeterServiceImpl implements IGreeterService {

	@Override
	public String welcomeUser(String name) {
		return "Welcome to Java "+name;
	}

}
