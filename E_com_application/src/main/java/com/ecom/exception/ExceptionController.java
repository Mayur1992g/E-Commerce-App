package com.ecom.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecom.model.Product;

@ControllerAdvice
@RequestMapping("/product")
public class ExceptionController {

	
	
	public Product createProduct(@RequestBody Product product) {
		
		
		return null;
	}
	
	
}
