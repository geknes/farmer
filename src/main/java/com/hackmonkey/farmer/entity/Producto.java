package com.hackmonkey.farmer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4918712976417119028L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_producto", nullable = false, updatable = false)
	private Long idProducto;
	
	private String nombreProducto;
	
}
