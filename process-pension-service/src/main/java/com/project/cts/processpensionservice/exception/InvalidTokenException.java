package com.project.cts.processpensionservice.exception;

@SuppressWarnings("serial")
public class InvalidTokenException extends RuntimeException {
	
	public InvalidTokenException(String message) {
		super(message);
	}

}
