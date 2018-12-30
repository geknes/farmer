package com.hackmonkey.farmer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2211932884204318645L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_departamento", nullable = false, updatable = false)
	private Long idDepartamento;
	
	private String nombreDepartamento;
	
}
