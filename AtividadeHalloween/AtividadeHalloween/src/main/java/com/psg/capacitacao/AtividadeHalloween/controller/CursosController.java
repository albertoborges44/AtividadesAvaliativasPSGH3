package com.psg.capacitacao.AtividadeHalloween.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.psg.capacitacao.AtividadeHalloween.model.Cursos;
import com.psg.capacitacao.AtividadeHalloween.model.Cursos;
import com.psg.capacitacao.AtividadeHalloween.repository.ICursosRepository;

@RestController
@RequestMapping(path = "/Halloween")
public class CursosController {
	
	@Autowired
	private ICursosRepository repo;
	
	@GetMapping(path = "/Cursos/getAll/{page}/{size}")
	public Page<Cursos> getAll(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "4") Integer size
			){
		 		PageRequest pr = PageRequest.of(page, size);
		 		Page<Cursos> list = this.repo.findAll(pr);
		 		return list;
	}
	
	@GetMapping(path = "/Cursos/getbyId/{cursoId}")
	public Cursos getById(@PathVariable int cursoId){
		return this.repo.findById(cursoId).orElse(null);
	}
	
	@PostMapping("/Cursos")
	public Cursos post(@RequestBody Cursos cursos) {		
		return this.repo.save(cursos);
	}
	
	@GetMapping("/Cursos/greater/{num}")
	public List<Cursos> getByCursosIdGreaterThan(@PathVariable int num) {
		return this.repo.findByCursosIdGreaterThan(num);
	}
	
	@GetMapping("/Cursos/between/{start}/{fim}")
	public List<Cursos> getByCursosIdBetween(int start, int fim){
		return this.repo.findByCursosIdBetween(start, fim);
	}
	
	
	@DeleteMapping(path = "/Cursos/{cursoId}")
	public void delete(@PathVariable int cursoId) {
		if(this.repo.findById(cursoId).orElse(null) != null)
			 this.repo.deleteById(cursoId);
	}
	
	@PutMapping(path = "/Cursos")
	public Cursos put(@RequestBody Cursos cursos) {
		return this.repo.findById(cursos.getcursosId())
				.map(cur -> {
					cur.setcursosId(cursos.getcursosId());
					cur.setDescricao(cursos.getDescricao());
					return this.repo.save(cur);
				})
				.orElse(null);
	}
}
