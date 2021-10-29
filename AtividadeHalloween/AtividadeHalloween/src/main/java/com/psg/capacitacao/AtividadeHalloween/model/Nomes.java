package com.psg.capacitacao.AtividadeHalloween.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Nomes")
public class Nomes {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer nomesId;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "SEXO")
	private char sexo;
	
	public Nomes() {
		
	}

	public char getsexo() {
		return sexo;
	}


	public void setsexo(char sexo) {
		this.sexo = sexo;
	}


	public Integer getnomesId() {
		return nomesId;
	}

	public void setnomesId(Integer nomesId) {
		this.nomesId = nomesId;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public Nomes(Integer nomesId, String nome, char sexo) {
		super();
		this.nomesId = nomesId;
		this.nome = nome;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Nomes [nomesId=" + nomesId + ", nome=" + nome + ", sexo=" + sexo + "]";
	}

	

	
}
