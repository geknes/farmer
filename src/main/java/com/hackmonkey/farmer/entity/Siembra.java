package com.hackmonkey.farmer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sembra")
public class Siembra extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2366651285151021784L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_siembra", nullable = false, updatable = false)
	private Long idSiembra;
	
	
	
}
