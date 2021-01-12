package com.cg.eis.exception;

public class InvalidNameException extends Exception {

	/**
	 * This is to handle invalid names.
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidNameException() {
		super();
	}
	public InvalidNameException(String errMsg) {
		super(errMsg);
	}
}
