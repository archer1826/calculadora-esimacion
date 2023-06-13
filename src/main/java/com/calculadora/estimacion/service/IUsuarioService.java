package com.calculadora.estimacion.service;

import java.util.List;
import com.calculadora.estimacion.entity.UsuarioEntity;

public interface IUsuarioService {

	public UsuarioEntity save(UsuarioEntity producto);
	
	public void delete(Integer id);
	
	public UsuarioEntity findById(Integer id);
	
	public List<UsuarioEntity> findAll();
}
