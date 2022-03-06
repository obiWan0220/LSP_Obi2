package org.howard.edu.lsp.hw5.implementation;

public class IntegerSetException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerSetException(String ExceptionMsg) { 
		super(ExceptionMsg); //Exception Message is defined under largest() and smallest() methods
	}
}
