package com.lumen.custom;

public class CustomBank {

	double balance;

	public CustomBank(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) throws ExceedingLimitException, NegativeBalanceException {

		try {
			System.out.println("In Bank");

			// balance is negative thow negativebalexception
			if (balance - amount <= 0) {
			    throw new NegativeBalanceException("Balance is negative. Try Again");
						}

			// amount>1000 throw exceedinglimitexception
			if (amount > 1000) {
				throw new ExceedingLimitException("Limit Exceeded");
			}

			
			// if all good
			else {
				balance = balance - amount;
				System.out.println("Balance " + balance);
			}

		}

		catch (Exception e) {
			System.out.println(e.getMessage());

		}

		finally {
			System.out.println("Close");
		}

		System.out.println("Completed");

	}
}
