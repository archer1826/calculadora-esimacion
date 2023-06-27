package com.calculadora.estimacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calculadora.estimacion.entity.PendientesEntity;

public interface IPendienteRepository extends JpaRepository<PendientesEntity, Integer>{

}
