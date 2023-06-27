package com.calculadora.estimacion.service;

import com.calculadora.estimacion.dto.ApiResponse;
import com.calculadora.estimacion.entity.EstimacionEntity;

public interface IEstimacionService {

	public ApiResponse crear (EstimacionEntity entity);
	public ApiResponse consultar ();
	public ApiResponse editar (EstimacionEntity entity);
	public ApiResponse eliminar (EstimacionEntity entity);
	
}
