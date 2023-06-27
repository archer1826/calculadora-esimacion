package com.calculadora.estimacion.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estimacion")
public class EstimacionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dni;
	private Integer autor;
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;
	private Integer fabrica;
	private Integer proyecto;
	private String estado;
	
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Integer getAutor() {
		return autor;
	}
	public void setAutor(Integer autor) {
		this.autor = autor;
	}
	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Integer getFabrica() {
		return fabrica;
	}
	public void setFabrica(Integer fabrica) {
		this.fabrica = fabrica;
	}
	public Integer getProyecto() {
		return proyecto;
	}
	public void setProyecto(Integer proyecto) {
		this.proyecto = proyecto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
