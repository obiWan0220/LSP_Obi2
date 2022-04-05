package org.howard.edu.lsp.assignment6.integerset;

public class IntegerSetException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerSetException(String ExceptionMsg) { 
		super(ExceptionMsg); //Exception Message is defined under largest() and smallest() methods
	}
}
