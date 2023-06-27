package com.calculadora.estimacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calculadora.estimacion.entity.EstimacionEntity;

public interface IEstimacionRepository extends JpaRepository<EstimacionEntity, Integer> {

}
