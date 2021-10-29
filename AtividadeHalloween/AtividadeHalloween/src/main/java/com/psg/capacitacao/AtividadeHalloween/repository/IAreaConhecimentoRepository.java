package com.psg.capacitacao.AtividadeHalloween.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.psg.capacitacao.AtividadeHalloween.model.AreaConhecimento;

public interface IAreaConhecimentoRepository extends JpaRepository<AreaConhecimento, Integer> {
	
	
	
	List<AreaConhecimento> findByAreaConhecimentoIdGreaterThan(int num);
	List<AreaConhecimento>findByAreaConhecimentoIdBetween(int start, int fim);
	
}
