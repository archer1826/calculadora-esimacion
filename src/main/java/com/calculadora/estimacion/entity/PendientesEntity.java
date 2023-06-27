package com.calculadora.estimacion.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pendientes")
public class PendientesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dni;
	private Integer estimacion;
	@Column(name = "fecha_entrega")
	private LocalDate fechaEntrega;
	private String descripcion;
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Integer getEstimacion() {
		return estimacion;
	}
	public void setEstimacion(Integer estimacion) {
		this.estimacion = estimacion;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}

