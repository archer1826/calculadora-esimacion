package com.calculadora.estimacion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.calculadora.estimacion.entity.ConsultaEstimacionEntity;

public interface IConsultaEstimacionRepository extends JpaRepository<ConsultaEstimacionEntity, Integer> {

	@Query(value = "select e.dni, u.nombre autor, f.nombre fabrica, p.nombre proyecto from estimacion e "
			+ "inner join usuario u on u.dni = e.autor "
			+ "inner join fabrica_entity f on f.dni = e.fabrica "
			+ "inner join proyecto_entity p on p.dni = e.proyecto", nativeQuery = true)
	public List<ConsultaEstimacionEntity> consultar();
	
}
