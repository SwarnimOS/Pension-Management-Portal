package com.project.cts.processpensionservice.exception;

@SuppressWarnings("serial")
public class NotAuthorizedException extends RuntimeException{

	
	public NotAuthorizedException(String message) {
		super(message);
	}
}
