package com.hackmonkey.farmer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cosecha")
public class Cosecha extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3602748693264601381L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_cosecha", nullable = false, updatable = false)
	private Long idCosecha;
	
	private String descripcion;
	
	
	
}
