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


import com.psg.capacitacao.AtividadeHalloween.model.Nomes;
import com.psg.capacitacao.AtividadeHalloween.repository.INomesRepository;

@RestController
@RequestMapping(path = "/Halloween")
public class NomesController {
	
	@Autowired
	private INomesRepository repo;
	
	@GetMapping(path = "/Nomes/getAll/{page}/{size}")
	public Page<Nomes> getAll(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "4") Integer size
			){
		 		PageRequest pr = PageRequest.of(page, size);
		 		Page<Nomes> list = this.repo.findAll(pr);
		 		return list;
	}
	
	@GetMapping(path = "/Nomes/getbyId/{nomeId}")
	public Nomes getById(@PathVariable int nomeId){
		return this.repo.findById(nomeId).orElse(null);
	}
	
	@GetMapping("/Nomes/greater/{num}")
	public List<Nomes> getByNomesIdGreaterThan(@PathVariable int num) {
		return this.repo.findByNomesIdGreaterThan(num);
	}
	
	@GetMapping("/Nomes/between/{start}/{fim}")
	public List<Nomes> getByNomesIdBetween(int start, int fim){
		return this.repo.findByNomesIdBetween(start, fim);
	}
	
	
	@PostMapping("/Nomes")
	public Nomes post(@RequestBody Nomes nomes) {
		return this.repo.save(nomes);
	}
	
	@DeleteMapping(path = "/Nomes/{nomeId}")
	public void delete(@PathVariable int nomeId) {
		if(this.repo.findById(nomeId).orElse(null) != null)
			 this.repo.deleteById(nomeId);
	}
	
	@PutMapping(path = "/Nomes")
	public Nomes put(@RequestBody Nomes nomes) {
		return this.repo.findById(nomes.getnomesId())
				.map(idi -> {
					idi.setnomesId(nomes.getnomesId());
					idi.setnome(nomes.getnome());
					return this.repo.save(nomes);
				})
				.orElse(null);
	}
}
