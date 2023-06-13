package com.calculadora.estimacion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProyectoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dni;
	private String nombre;
	private String nombre_lider;
	private String estado;
	

}
