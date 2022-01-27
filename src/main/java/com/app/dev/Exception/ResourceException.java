package com.app.dev.Exception;

public class ResourceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceException(String message, Throwable cause) {
		super(message, cause);

	}

	public ResourceException() {
		super();

	}
}
