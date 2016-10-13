package com.gsdp.exception;

public class SampleException extends RuntimeException {

	private static final long serialVersionUID = 8573098490495163758L;


	public SampleException(String message) {
		super(message);
	}


	public SampleException(String message, Throwable cause) {
		super(message, cause);
	}

}
