package com.psg.capacitacao.AtividadeHalloween.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Profissoes")
public class Profissoes {
	
	@Id
	@Column(name = "PROFISSAO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer profissoesId;
	
	private String profissao;
	
	public Profissoes() {
		
	}

	public Integer getProfissoesId() {
		return profissoesId;
	}

	public void setProfissoesId(Integer profissoesId) {
		this.profissoesId = profissoesId;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Profissoes(Integer profissoesId, String profissao) {
		super();
		this.profissoesId = profissoesId;
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Profissoes [profissoesId=" + profissoesId + ", profissao=" + profissao + "]";
	}
	
	
	
	
}
