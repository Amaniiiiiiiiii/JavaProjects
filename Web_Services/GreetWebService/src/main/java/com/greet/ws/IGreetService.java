package com.greet.ws;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

//exposed a 
@WebService
public interface IGreetService {

	@WebMethod
	public String greet( @WebParam String name);
}
