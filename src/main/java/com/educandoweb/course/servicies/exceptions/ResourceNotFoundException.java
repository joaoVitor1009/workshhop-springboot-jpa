package com.educandoweb.course.servicies.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
	private static final long serialversionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found. id " + id);
	}

}
