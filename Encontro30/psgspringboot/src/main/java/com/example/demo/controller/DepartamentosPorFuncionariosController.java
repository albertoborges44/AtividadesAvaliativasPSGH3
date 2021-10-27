package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DepartamentosPorFuncionarios;
import com.example.demo.model.Produto;
import com.example.demo.repository.IDepartamentosPorFuncionariosRepository;

@RestController
@RequestMapping(path = "/api")
public class DepartamentosPorFuncionariosController {
	
	@Autowired
	private IDepartamentosPorFuncionariosRepository repo;
	
	@GetMapping(path = "/departamentosPorFunc")
	public List<DepartamentosPorFuncionarios> getAll(){
		return this.repo.findAll();
	}
	
	@GetMapping("/departamentosPorFunc/{id}")
	public DepartamentosPorFuncionarios getById(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}
	
//	@GetMapping("/departamentos/greater/{num}")
//	public List<Departamento> getBydepartamentoIdGreaterThan(@PathVariable int num) {
//		return this.repo.findBydepartamentoIdGreaterThan(num);
//	}
//	
	@GetMapping(path = "/departamentosPorFunc/funcionario/{funid}")
	public List<DepartamentosPorFuncionarios> getPorFucionarioID(@PathVariable int funid) {
		return this.repo.findByFuncionarioID(funid);
	}
	
	@GetMapping(path = "/departamentosPorFunc/departamento/{deptoid}")
	public List<DepartamentosPorFuncionarios> getPorDepartamentoID(@PathVariable int deptoid) {
		return this.repo.findByDeptoID(deptoid);
	}

	@PostMapping("/departamentosPorFunc")
	public DepartamentosPorFuncionarios post(@RequestBody DepartamentosPorFuncionarios departamentoPorFunc) {
//		departamentoPorFunc.setdepartamentoId(repo.findBydepartamentoIdMax() + 1);
		return this.repo.save(departamentoPorFunc);
	}
	
	@DeleteMapping("/departamentosPorFunc/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null)
			this.repo.deleteById(id);
	}
	
	@PutMapping("/departamentosPorFunc")
	public DepartamentosPorFuncionarios put(@RequestBody DepartamentosPorFuncionarios novoDepartamentoPorFunc) {
		return this.repo.findById(novoDepartamentoPorFunc.getDeptoPorFuncID())
				.map(depFun -> {
					depFun.setDeptoPorFuncID(novoDepartamentoPorFunc.getDeptoPorFuncID());
					depFun.setDeptoID(novoDepartamentoPorFunc.getDeptoID());
					depFun.setFuncionarioID(novoDepartamentoPorFunc.getFuncionarioID());
					depFun.setDataInicial(novoDepartamentoPorFunc.getDataInicial());
					depFun.setDataFinal(novoDepartamentoPorFunc.getDataFinal());
					return this.repo.save(depFun);
				})
				.orElse(null);
	}
	
}