package com.psg.capacitacao.AtividadeHalloween.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psg.capacitacao.AtividadeHalloween.model.Cursos;

public interface ICursosRepository extends JpaRepository<Cursos, Integer> {

	List<Cursos> findByCursosIdBetween(int start, int fim);

	List<Cursos> findByCursosIdGreaterThan(int num);
	
	
//	int findByCursosIdMax();

}
