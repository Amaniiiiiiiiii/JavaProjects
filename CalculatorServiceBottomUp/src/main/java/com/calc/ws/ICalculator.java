package com.calc.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ICalculator {
@WebMethod
public double add(@WebParam int x,@WebParam int y );
}
