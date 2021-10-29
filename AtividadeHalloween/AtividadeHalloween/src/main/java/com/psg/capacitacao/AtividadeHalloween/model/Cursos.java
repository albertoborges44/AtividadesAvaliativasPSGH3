package com.psg.capacitacao.AtividadeHalloween.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Cursos")
public class Cursos {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer cursosId;
	
	@Column(name = "DESCR")
	private String descricao;
	
	public Cursos() {
		
	}

	public Integer getcursosId() {
		return cursosId;
	}

	public void setcursosId(Integer cursosId) {
		this.cursosId = cursosId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cursos(Integer cursosId, String descricao) {
		super();
		this.cursosId = cursosId;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "CursosController [cursosId=" + cursosId + ", Descricao=" + descricao + "]";
	}
	
	
	
}
