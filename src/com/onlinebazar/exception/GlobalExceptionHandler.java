package com.onlinebazar.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(NoHandlerFoundException.class)
	public String NotFoundExceptionHanler(Model model) {
		model.addAttribute("errorTitle", "This page is not constructed.");
		model.addAttribute("errorDescription", "This page you are looking for is not constructed yet.");
		model.addAttribute("title", "404 error page");
		return "error";
	}

	@ExceptionHandler(ProductNotFoundException.class)
	public String ProductNotFoundExceptionHanler(Model model) {
		model.addAttribute("errorTitle", "Product Unavailable");
		model.addAttribute("errorDescription", "This product you are looking for is not available at this moment.");
		model.addAttribute("title", "Product Unavailable");
		return "error";
	}

	@ExceptionHandler(Exception.class)
	public String ExceptionHanler(Model model, Exception e) {
		model.addAttribute("errorTitle", "Contact with your adminstrator");
		model.addAttribute("errorDescription", e.toString());
		model.addAttribute("title", "Error Occurred");
		return "error";
	}
	
}
