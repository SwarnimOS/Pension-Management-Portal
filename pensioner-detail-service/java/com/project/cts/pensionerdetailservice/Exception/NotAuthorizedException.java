package com.project.cts.pensionerdetailservice.Exception;

@SuppressWarnings("serial")
public class NotAuthorizedException extends RuntimeException{

	
	public NotAuthorizedException(String message) {
		super(message);
	}
}
