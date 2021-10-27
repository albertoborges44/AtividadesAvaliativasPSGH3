package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DepartamentosPorFuncionarios;

public interface IDepartamentosPorFuncionariosRepository extends JpaRepository<DepartamentosPorFuncionarios, Integer>{
	
	List<DepartamentosPorFuncionarios>findByFuncionarioID(int id);
	List<DepartamentosPorFuncionarios>findByDeptoID(int id);
	
}
