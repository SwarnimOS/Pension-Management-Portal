package com.project.cts.pensionerdetailservice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class AadharNotFoundException extends RuntimeException {

	public AadharNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
