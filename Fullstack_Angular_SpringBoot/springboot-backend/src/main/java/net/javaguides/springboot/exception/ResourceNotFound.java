package net.javaguides.springboot.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException{
	
	private static final long serialversionUID = 1L;
	
	public ResourceNotFound(String message) {
		super(message);
	}
	

}
