package com.project.cts.pensionerdetailservice.Exception;

@SuppressWarnings("serial")
public class InvalidTokenException extends RuntimeException {
	
	public InvalidTokenException(String message) {
		super(message);
	}

}
