package com.calculadora.estimacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora.estimacion.dto.ApiResponse;
import com.calculadora.estimacion.service.ISaludoService;
import com.calculadora.estimacion.util.ResponseUtil;

@RestController
@RequestMapping("/saludo")
public class SaludoController {

	@Autowired
	private ISaludoService service;
	
	@GetMapping
	public ResponseEntity<ApiResponse> saludo(){
		ApiResponse response = new ApiResponse();
		try {
			response = service.saludo();
		} catch (Exception e) {
			response = ResponseUtil.response(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), null);
		}
		return new ResponseEntity<>(response, response.getStatus());
	}
	
}
