package com.greet.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IGreeterService {

	@WebMethod
	public String welcomeUser(@WebParam String name);
}
