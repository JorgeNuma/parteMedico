package com.sinensia.partemedico.presentation.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class errorController implements ErrorController {

	
private static Logger logger = LoggerFactory.getLogger(errorController.class);
	
	@RequestMapping("/error")
	public String handleError (HttpServletRequest request) {
		
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		
		String paginaError = "";
		
		if (status != null) {
			Integer statusCode = Integer.valueOf(status.toString());
			
			if (statusCode == HttpStatus.NOT_FOUND.value()) {
				logger.warn("recurso no encontrado");
				paginaError = "404";
			}
			if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
				paginaError = "500";
			}
			
		}
		
		return paginaError;
	}
	
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
