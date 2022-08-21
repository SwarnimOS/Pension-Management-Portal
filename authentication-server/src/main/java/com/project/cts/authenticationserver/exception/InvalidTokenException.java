package com.project.cts.authenticationserver.exception;

@SuppressWarnings("serial")
public class InvalidTokenException extends RuntimeException {
	
	public InvalidTokenException(String message) {
		super(message);
	}

}
