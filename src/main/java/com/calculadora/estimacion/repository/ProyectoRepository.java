package com.calculadora.estimacion.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.calculadora.estimacion.entity.ProyectoEntity;
import com.calculadora.estimacion.entity.SaludoEntity;

public interface ProyectoRepository extends JpaRepository<ProyectoEntity, Integer> {
	
}
