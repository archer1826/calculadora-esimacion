package com.calculadora.estimacion.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.calculadora.estimacion.dto.ApiResponse;
import com.calculadora.estimacion.repository.ISaludoRepository;
import com.calculadora.estimacion.service.ISaludoService;
import com.calculadora.estimacion.util.ResponseUtil;

@Service
public class SaludoServiceImpl implements ISaludoService {

	@Autowired
	private ISaludoRepository repository;
	
	@Override
	public ApiResponse saludo() {
		return ResponseUtil.response(HttpStatus.OK, "bien", repository.findAll());
	}


	
}
