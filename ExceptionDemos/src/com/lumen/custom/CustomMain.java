package com.lumen.custom;

public class CustomMain {

	public static void main(String[] args) throws NegativeBalanceException,ExceedingLimitException {
		
		
		System.out.println("In ATM");
		
		CustomBank bank = new CustomBank(8000.0);
		try {
		bank.withdraw(900);
		System.out.println("Amount withdrawn");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
