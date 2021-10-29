package com.psg.capacitacao.AtividadeHalloween.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psg.capacitacao.AtividadeHalloween.model.Idiomas;

public interface IIdiomasRepository extends JpaRepository<Idiomas, Integer> {

	List<Idiomas> findByIdiomasIdBetween(int start, int fim);

	List<Idiomas> findByIdiomasIdGreaterThan(int num);

}
