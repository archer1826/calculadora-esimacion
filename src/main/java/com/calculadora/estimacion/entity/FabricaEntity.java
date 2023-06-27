package com.calculadora.estimacion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FabricaEntity {

    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    @Column(length = 3)
    private int dni;
    @Column(length = 30)
    private String nombre;
    @Column(length = 10)
    private String estado;
    @Column(length = 30)
    private String gerente;
    @Column(length = 30)
    private String emailContact;
    
 // getters y setters
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public String getEmailContact() {
		return emailContact;
	}
	public void setEmailContact(String emailContact) {
		this.emailContact = emailContact;
	}        
}