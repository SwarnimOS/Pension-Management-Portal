package com.project.cts.pensionerdetailservice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage());

		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(AadharNotFoundException.class)
	public final ResponseEntity<Object> handleAadharNotFoundException(AadharNotFoundException ex, WebRequest request) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage());

		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.NOT_FOUND);

	}
	
	@ExceptionHandler(InvalidTokenException.class)
	public final ResponseEntity<ExceptionResponse> handleNotAuthorizedException(InvalidTokenException ex, WebRequest request) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.FORBIDDEN);

	}
}
