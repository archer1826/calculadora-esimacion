package com.calculadora.estimacion.dto;

import org.springframework.http.HttpStatus;

public class ApiResponse {

	private String mensaje;
	private HttpStatus status;
	private Object data;
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
	
}
