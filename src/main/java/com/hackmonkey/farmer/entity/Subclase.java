package com.hackmonkey.farmer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subclase")
public class Subclase extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1717428422147541435L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_subclase", nullable = false, updatable = false)
	private Long idSubclase;
	
	private String nombreSubclase;
	
}
