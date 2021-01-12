package com.cg.eis.exception;

public class InvalidAgeException extends Exception {
	/**
	 * This is to handle invalid age.
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException() {
		super();
	}
	public InvalidAgeException(String errMsg) {
		super(errMsg);
	}
}
