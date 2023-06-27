package com.calculadora.estimacion.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.calculadora.estimacion.dto.ApiResponse;
import com.calculadora.estimacion.entity.ProyectoEntity;
import com.calculadora.estimacion.repository.ProyectoRepository;
import com.calculadora.estimacion.service.IProyectoService;
import com.calculadora.estimacion.util.ResponseUtil;

@Service
public class ProyectoServiceImpl implements IProyectoService {

	@Autowired
	private ProyectoRepository repository;
	
	@Override
	public ApiResponse crear(ProyectoEntity entity) {
		repository.save(entity);
		return ResponseUtil.response(HttpStatus.OK, "bien", "bien");
	}

	@Override
	public ApiResponse consultar() {
		return ResponseUtil.response(HttpStatus.OK, "bien", repository.findAll());
	}

	@Override
	public ApiResponse editar(ProyectoEntity entity) {
		repository.save(entity);
		return ResponseUtil.response(HttpStatus.OK, "bien", "bien");
	}

	@Override
	public ApiResponse eliminar(ProyectoEntity entity) {
		repository.delete(entity);
		return ResponseUtil.response(HttpStatus.OK, "bien", "bien");
	}

}
