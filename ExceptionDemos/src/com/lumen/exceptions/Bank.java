package com.lumen.exceptions;

public class Bank {

	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) throws Exception{
		
		try {
			System.out.println("In Bank");

			if (amount > 1000)
				{throw new ArithmeticException("Exceeding limit");}
			balance -= amount;
			System.out.println("Balance " + balance);
			} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} 
		
		finally {
			System.out.println("Close");
		}
		
		System.out.println("Completed");
	}

}
