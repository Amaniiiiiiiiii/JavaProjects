package com.voterapp.exceptions;

@SuppressWarnings("serial")
public class InvalidVoterException extends Exception {

	public InvalidVoterException() {
		super();
	}

	public InvalidVoterException(String message) {
		super(message);
	}

}
