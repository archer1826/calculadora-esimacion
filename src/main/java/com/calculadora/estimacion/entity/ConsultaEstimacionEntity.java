package com.calculadora.estimacion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ConsultaEstimacionEntity {

	@Id
	private Integer dni;
	private String autor; 
	private String fabrica;
	private String proyecto;
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getFabrica() {
		return fabrica;
	}
	public void setFabrica(String fabrica) {
		this.fabrica = fabrica;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	
	
	
}
