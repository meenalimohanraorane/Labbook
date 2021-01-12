package com.cg.eis.exception;

public class EmployeeException extends Exception {
	/**
	 * This is to handle invalid salary.
	 */
	private static final long serialVersionUID = 1L;
	
	public EmployeeException() {
		super();
	}
	public EmployeeException(String errMsg) {
		super(errMsg);
	}
}
