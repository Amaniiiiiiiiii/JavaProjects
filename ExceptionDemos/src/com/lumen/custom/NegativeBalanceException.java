package com.lumen.custom;

public class NegativeBalanceException extends Exception {

	public NegativeBalanceException() {
		super();
	}

	public NegativeBalanceException(String message) {
		super(message);
	}

}
