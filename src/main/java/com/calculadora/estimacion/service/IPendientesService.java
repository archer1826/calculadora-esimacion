package com.calculadora.estimacion.service;

import com.calculadora.estimacion.dto.ApiResponse;
import com.calculadora.estimacion.entity.PendientesEntity;

public interface IPendientesService {

	public ApiResponse crear (PendientesEntity entity);
	public ApiResponse editar (PendientesEntity entity);
	public ApiResponse eliminar (PendientesEntity entity);
	public ApiResponse consultar ();
	
}
