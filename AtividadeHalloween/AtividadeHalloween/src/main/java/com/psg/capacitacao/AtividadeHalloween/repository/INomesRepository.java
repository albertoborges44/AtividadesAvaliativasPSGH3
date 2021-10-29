package com.psg.capacitacao.AtividadeHalloween.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psg.capacitacao.AtividadeHalloween.model.Nomes;

public interface INomesRepository extends JpaRepository<Nomes, Integer>{

	List<Nomes> findByNomesIdBetween(int start, int fim);

	List<Nomes> findByNomesIdGreaterThan(int num);

}
