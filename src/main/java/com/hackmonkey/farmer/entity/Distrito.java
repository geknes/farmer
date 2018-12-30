package com.hackmonkey.farmer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="distrito")
public class Distrito extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3026245681899694140L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_distrito", nullable = false, updatable = false)
	private Long idDistrito;
	
	private String nombreDistrito;
	
}
