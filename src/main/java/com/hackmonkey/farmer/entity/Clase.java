package com.hackmonkey.farmer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clase")
public class Clase extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4790314434614489904L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_clase", nullable = false, updatable = false)
	private Long idClase;
	
	private String nombreClase;

	public Clase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdClase() {
		return idClase;
	}

	public void setIdClase(Long idClase) {
		this.idClase = idClase;
	}

	public String getNombreClase() {
		return nombreClase;
	}

	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}
	
	
	
}
