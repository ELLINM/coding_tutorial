package com.test.web.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NullPointerException.class)
	public String nullpointerHandler(Model model, NullPointerException ex){
		model.addAttribute("msg", "널포인트 에러발생");
		model.addAttribute("ex", ex);
		return "/exception/error";
	}
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Model model, Exception ex){
		model.addAttribute("msg", "에러발생");
		model.addAttribute("ex", ex);
		return "/exception/error";
	}
	
}
