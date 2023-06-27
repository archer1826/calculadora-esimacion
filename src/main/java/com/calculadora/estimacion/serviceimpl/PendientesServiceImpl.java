package com.calculadora.estimacion.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.calculadora.estimacion.dto.ApiResponse;
import com.calculadora.estimacion.entity.PendientesEntity;
import com.calculadora.estimacion.repository.IPendienteRepository;
import com.calculadora.estimacion.service.IPendientesService;
import com.calculadora.estimacion.util.ResponseUtil;

@Service
public class PendientesServiceImpl implements IPendientesService {

	@Autowired
	private IPendienteRepository repository;
	
	@Override
	public ApiResponse crear(PendientesEntity entity) {
		repository.save(entity);
		return ResponseUtil.response(HttpStatus.OK, "bien", "bien");
	}

	@Override
	public ApiResponse editar(PendientesEntity entity) {
		repository.save(entity);
		return ResponseUtil.response(HttpStatus.OK, "bien", "bien");
	}

	@Override
	public ApiResponse eliminar(PendientesEntity entity) {
		repository.delete(entity);
		return ResponseUtil.response(HttpStatus.OK, "bien", "bien");
	}

	@Override
	public ApiResponse consultar() {
		List<PendientesEntity> lista =  repository.findAll();
		return ResponseUtil.response(HttpStatus.OK, "bien", lista);
	}

}
