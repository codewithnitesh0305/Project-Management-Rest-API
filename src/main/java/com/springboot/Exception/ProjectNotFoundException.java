package com.springboot.Exception;

import java.io.Serial;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ProjectNotFoundException extends RuntimeException{

	@Serial
	private static final long serialVersionUID = 8981094689175394344L;
	
	public ProjectNotFoundException(String message) {
		super(message);
	}

	
	


}
