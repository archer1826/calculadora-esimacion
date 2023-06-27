package com.calculadora.estimacion.service;

import com.calculadora.estimacion.dto.ApiResponse;
import com.calculadora.estimacion.entity.ProyectoEntity;

public interface IProyectoService {

	public ApiResponse crear(ProyectoEntity entity);
	public ApiResponse consultar();
	public ApiResponse editar(ProyectoEntity entity);
	public ApiResponse eliminar(ProyectoEntity entity);
	
}
