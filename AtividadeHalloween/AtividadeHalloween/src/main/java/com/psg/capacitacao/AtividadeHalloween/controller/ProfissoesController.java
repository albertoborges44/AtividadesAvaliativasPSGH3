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

import com.psg.capacitacao.AtividadeHalloween.model.Profissoes;
import com.psg.capacitacao.AtividadeHalloween.model.Profissoes;
import com.psg.capacitacao.AtividadeHalloween.repository.IProfissoesRepository;

@RestController
@RequestMapping(path = "/Halloween")
public class ProfissoesController {
	
	@Autowired
	private IProfissoesRepository repo;
	
	@GetMapping(path = "/Profissoes/getAll/{page}/{size}")
	public Page<Profissoes> getAll(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "4") Integer size
			){
		 		PageRequest pr = PageRequest.of(page, size);
		 		Page<Profissoes> list = this.repo.findAll(pr);
		 		return list;
	}
	
	@GetMapping(path = "/Profissoes/getbyId/{profissaoId}")
	public Profissoes getById(@PathVariable int profissaoId){
		return this.repo.findById(profissaoId).orElse(null);
	}
	
	@GetMapping("/Profissoes/greater/{num}")
	public List<Profissoes> getByProfissoesIdGreaterThan(@PathVariable int num) {
		return this.repo.findByProfissoesIdGreaterThan(num);
	}
	
	@GetMapping("/Profissoes/between/{start}/{fim}")
	public List<Profissoes> getByProfissoesIdBetween(int start, int fim){
		return this.repo.findByProfissoesIdBetween(start, fim);
	}
	
	
	
	@PostMapping("/Profissoes")
	public Profissoes post(@RequestBody Profissoes profissoes) {
		return this.repo.save(profissoes);
	}
	
	@DeleteMapping(path = "/Profissoes/{profissaoId}")
	public void delete(@PathVariable int profissaoId) {
		if(this.repo.findById(profissaoId).orElse(null) != null)
			 this.repo.deleteById(profissaoId);
	}
	
	@PutMapping(path = "/Profissoes")
	public Profissoes put(@RequestBody Profissoes profissoes) {
		return this.repo.findById(profissoes.getProfissoesId())
				.map(pro -> {
					pro.setProfissoesId(profissoes.getProfissoesId());
					pro.setProfissao(profissoes.getProfissao());
					return this.repo.save(profissoes);
				})
				.orElse(null);
	}
}
