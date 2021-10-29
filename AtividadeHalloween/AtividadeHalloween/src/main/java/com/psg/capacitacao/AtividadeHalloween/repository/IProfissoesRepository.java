package com.psg.capacitacao.AtividadeHalloween.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psg.capacitacao.AtividadeHalloween.model.Profissoes;

public interface IProfissoesRepository extends JpaRepository<Profissoes, Integer> {

	List<Profissoes> findByProfissoesIdBetween(int start, int fim);

	List<Profissoes> findByProfissoesIdGreaterThan(int num);

}
