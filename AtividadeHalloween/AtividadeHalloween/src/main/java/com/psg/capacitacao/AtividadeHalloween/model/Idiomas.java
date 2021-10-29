package com.psg.capacitacao.AtividadeHalloween.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Idiomas")
public class Idiomas {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer idiomasId;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "ABREVIADO")
	private String abreviacao;
	
	public Idiomas() {
		
	}

	public String getAbreviacao() {
		return abreviacao;
	}


	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}


	public Integer getIdiomasId() {
		return idiomasId;
	}

	public void setIdiomasId(Integer idiomasId) {
		this.idiomasId = idiomasId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Idiomas(Integer idiomasId, String descricao, String abreviacao) {
		super();
		this.idiomasId = idiomasId;
		this.descricao = descricao;
		this.abreviacao = abreviacao;
	}

	@Override
	public String toString() {
		return "Idiomas [idiomasId=" + idiomasId + ", descricao=" + descricao + ", abreviacao=" + abreviacao + "]";
	}


	
}
