package com.greet.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.greet.ws.IGreetService" )
	public class GreetServiceImpl implements IGreetService{
		public String greet(String name) {
			return "Great Day"+name;
		}
		
}
