package com.hackmonkey.farmer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grupo")
public class Grupo extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3731167430677722297L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_grupo", nullable = false, updatable = false)
	private Long idGrupo;
	
	private String nombreGrupo;

	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	
	
	
}
