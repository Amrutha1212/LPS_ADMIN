package com.javacloud.lps.response;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleCustomValidationError(MethodArgumentNotValidException e) {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Response<?> response = new Response(true, e.getBindingResult().getFieldError().getDefaultMessage(),
				new ArrayList());
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}

}
