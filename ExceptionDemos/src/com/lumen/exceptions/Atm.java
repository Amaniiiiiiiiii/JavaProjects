package com.lumen.exceptions;

public class Atm {

	public static void main(String[] args) {

		System.out.println("In ATM");
		Bank bank = new Bank(5000.0);
		try {
		bank.withdraw(2000);
		System.out.println("Amount withdrawn");
		}
		catch(Exception e) {
			System.out.println("Try again");
			System.out.println(e.getMessage());
		}
	}

}
