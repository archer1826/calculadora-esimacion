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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre_lider() {
		return nombre_lider;
	}
	public void setNombre_lider(String nombre_lider) {
		this.nombre_lider = nombre_lider;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
