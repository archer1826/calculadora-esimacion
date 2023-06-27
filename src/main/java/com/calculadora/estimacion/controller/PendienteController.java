package com.calculadora.estimacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora.estimacion.dto.ApiResponse;
import com.calculadora.estimacion.entity.PendientesEntity;
import com.calculadora.estimacion.service.IPendientesService;
import com.calculadora.estimacion.util.ResponseUtil;

@RestController
@RequestMapping("/pendiente")
public class PendienteController {

	@Autowired
	private IPendientesService service;
	
	@PostMapping("/crear")
	public ResponseEntity<ApiResponse> crear(@RequestBody PendientesEntity entity){
		ApiResponse response = new ApiResponse();
		try {
			response = service.crear(entity);
		} catch (Exception e) {
			response = ResponseUtil.response(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), null);
		}
		return new ResponseEntity<>(response, response.getStatus());
	}
	
	@GetMapping("/consultar")
	public ResponseEntity<ApiResponse> consultar(){
		ApiResponse response = new ApiResponse();
		try {
			response = service.consultar();
		} catch (Exception e) {
			response = ResponseUtil.response(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), null);
		}
		return new ResponseEntity<>(response, response.getStatus());
	}
	
	@PutMapping("/editar")
	public ResponseEntity<ApiResponse> editar(@RequestBody PendientesEntity entity){
		ApiResponse response = new ApiResponse();
		try {
			response = service.editar(entity);
		} catch (Exception e) {
			response = ResponseUtil.response(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), null);
		}
		return new ResponseEntity<>(response, response.getStatus());
	}
	
	@PostMapping("/eliminar")
	public ResponseEntity<ApiResponse> eliminar(@RequestBody PendientesEntity entity){
		ApiResponse response = new ApiResponse();
		try {
			response = service.eliminar(entity);
		} catch (Exception e) {
			response = ResponseUtil.response(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), null);
		}
		return new ResponseEntity<>(response, response.getStatus());
	}
	
}
