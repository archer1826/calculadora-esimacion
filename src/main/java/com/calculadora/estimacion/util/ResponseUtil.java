package com.calculadora.estimacion.util;

import org.springframework.http.HttpStatus;

import com.calculadora.estimacion.dto.ApiResponse;

public class ResponseUtil {
	
	private ResponseUtil () {}

	public static ApiResponse response (HttpStatus status, String mensaje, Object data) {
		ApiResponse response = new ApiResponse();
		response.setStatus(status);
		response.setMensaje(mensaje);
		response.setData(data);
		return response;
	}
	
}
