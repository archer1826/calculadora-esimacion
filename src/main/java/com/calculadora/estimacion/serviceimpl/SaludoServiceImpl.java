package com.calculadora.estimacion.serviceimpl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.calculadora.estimacion.dto.ApiResponse;
import com.calculadora.estimacion.service.ISaludoService;
import com.calculadora.estimacion.util.ResponseUtil;

@Service
public class SaludoServiceImpl implements ISaludoService {

	@Override
	public ApiResponse saludo() {
		return ResponseUtil.response(HttpStatus.OK, "bien", "HOLA MUNDO");
	}


	
}
