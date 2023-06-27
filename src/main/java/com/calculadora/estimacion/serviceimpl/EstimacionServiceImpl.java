package com.calculadora.estimacion.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.calculadora.estimacion.dto.ApiResponse;
import com.calculadora.estimacion.entity.EstimacionEntity;
import com.calculadora.estimacion.repository.IConsultaEstimacionRepository;
import com.calculadora.estimacion.repository.IEstimacionRepository;
import com.calculadora.estimacion.service.IEstimacionService;
import com.calculadora.estimacion.util.ResponseUtil;

@Service
public class EstimacionServiceImpl implements IEstimacionService {

	@Autowired
	private IEstimacionRepository repository;
	
	@Autowired
	private IConsultaEstimacionRepository consultaRepo;
	
	@Override
	public ApiResponse crear(EstimacionEntity entity) {
		repository.save(entity);
		return ResponseUtil.response(HttpStatus.OK, "bien", "bien");
	}

	@Override
	public ApiResponse consultar() {
		return ResponseUtil.response(HttpStatus.OK, "bien", consultaRepo.consultar());
	}

	@Override
	public ApiResponse editar(EstimacionEntity entity) {
		repository.save(entity);
		return ResponseUtil.response(HttpStatus.OK, "bien", "bien");
	}

	@Override
	public ApiResponse eliminar(EstimacionEntity entity) {
		repository.delete(entity);
		return ResponseUtil.response(HttpStatus.OK, "bien", "bien");
	}

}
