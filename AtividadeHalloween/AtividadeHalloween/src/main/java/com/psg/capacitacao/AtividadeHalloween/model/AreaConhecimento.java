package com.psg.capacitacao.AtividadeHalloween.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_AreaConhecimento")
public class AreaConhecimento {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer areaConhecimentoId;
	
	@Column(name = "DESCR")
	private String descricao;
	
	public AreaConhecimento() {
		
	}

	public Integer getareaConhecimentoId() {
		return areaConhecimentoId;
	}

	public void setareaConhecimentoId(Integer areaConhecimentoId) {
		this.areaConhecimentoId = areaConhecimentoId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public AreaConhecimento(Integer areaConhecimentoId, String descricao) {
		super();
		this.areaConhecimentoId = areaConhecimentoId;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ProfissoesController [areaConhecimentoId=" + areaConhecimentoId + ", Descricao=" + descricao + "]";
	}
	
	
	
}
