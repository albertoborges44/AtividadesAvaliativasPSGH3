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

import com.psg.capacitacao.AtividadeHalloween.model.Idiomas;
import com.psg.capacitacao.AtividadeHalloween.model.Idiomas;
import com.psg.capacitacao.AtividadeHalloween.repository.IIdiomasRepository;

@RestController
@RequestMapping(path = "/Halloween")
public class IdiomasController {
	
	@Autowired
	private IIdiomasRepository repo;
	
	@GetMapping(path = "/Idiomas/getAll/{page}/{size}")
	public Page<Idiomas> getAll(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "4") Integer size
			){
		 		PageRequest pr = PageRequest.of(page, size);
		 		Page<Idiomas> list = this.repo.findAll(pr);
		 		return list;
	}
	
	@GetMapping(path = "/Idiomas/getbyId/{idiomaId}")
	public Idiomas getById(@PathVariable int idiomaId){
		return this.repo.findById(idiomaId).orElse(null);
	}
	
	@GetMapping("/Idiomas/greater/{num}")
	public List<Idiomas> getByIdiomasIdGreaterThan(@PathVariable int num) {
		return this.repo.findByIdiomasIdGreaterThan(num);
	}
	
	@GetMapping("/Idiomas/between/{start}/{fim}")
	public List<Idiomas> getByIdiomasIdBetween(int start, int fim){
		return this.repo.findByIdiomasIdBetween(start, fim);
	}
	
	
	@PostMapping("/Idiomas")
	public Idiomas post(@RequestBody Idiomas idiomas) {
		return this.repo.save(idiomas);
	}
	
	@DeleteMapping(path = "/Idiomas/{idiomaId}")
	public void delete(@PathVariable int idiomaId) {
		if(this.repo.findById(idiomaId).orElse(null) != null)
			 this.repo.deleteById(idiomaId);
	}
	
	@PutMapping(path = "/Idiomas")
	public Idiomas put(@RequestBody Idiomas idiomas) {
		return this.repo.findById(idiomas.getIdiomasId())
				.map(idi -> {
					idi.setIdiomasId(idiomas.getIdiomasId());
					idi.setDescricao(idiomas.getDescricao());
					return this.repo.save(idiomas);
				})
				.orElse(null);
	}
}
