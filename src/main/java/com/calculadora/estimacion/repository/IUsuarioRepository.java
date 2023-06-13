package com.calculadora.estimacion.repository;

import org.springframework.data.repository.CrudRepository;
import com.calculadora.estimacion.entity.UsuarioEntity;

public interface IUsuarioRepository extends CrudRepository<UsuarioEntity, Integer>{

}
