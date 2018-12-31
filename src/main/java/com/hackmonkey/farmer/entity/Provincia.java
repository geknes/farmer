package com.hackmonkey.farmer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="provincia")
public class Provincia extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1430570419283791363L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_provincia", nullable = false, updatable = false)
	private Long idProvincia;
	
	private String nombreProvincia;
	
}
