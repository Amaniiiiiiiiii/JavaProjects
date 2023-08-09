package com.calc.ws;



	@WebService
	
	public interface ICalculatorService {	
		
		@WebMethod
		public int add(@WebParam int x, int y);
}
