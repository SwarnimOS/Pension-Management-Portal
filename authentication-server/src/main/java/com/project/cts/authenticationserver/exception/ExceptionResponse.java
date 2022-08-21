package com.project.cts.authenticationserver.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {

	private String message;
	private LocalDateTime tiemstamp;

	public ExceptionResponse() {

	}

	public ExceptionResponse(String message, LocalDateTime tiemstamp) {
		this.message = message;
		this.tiemstamp = tiemstamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTiemstamp() {
		return tiemstamp;
	}

	public void setTiemstamp(LocalDateTime tiemstamp) {
		this.tiemstamp = tiemstamp;
	}

}
