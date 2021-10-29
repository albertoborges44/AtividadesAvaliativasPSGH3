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


import com.psg.capacitacao.AtividadeHalloween.model.AreaConhecimento;
import com.psg.capacitacao.AtividadeHalloween.repository.IAreaConhecimentoRepository;

@RestController
@RequestMapping(path = "/Halloween")
public class AreaConhecimentoController {
	
	@Autowired
	private IAreaConhecimentoRepository repo;
	
	@GetMapping(path = "/areaConhecimento/getAll/{page}/{size}")
	public Page<AreaConhecimento> getAll(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "4") Integer size
			){
		 		PageRequest pr = PageRequest.of(page, size);
		 		Page<AreaConhecimento> list = this.repo.findAll(pr);
		 		return list;
	}
	
	@GetMapping(path = "/areaConhecimento/getbyId/{areaId}")
	public AreaConhecimento getById(@PathVariable int areaId){
		return this.repo.findById(areaId).orElse(null);
	}
	
	@GetMapping("/AreaConhecimentos/greater/{num}")
	public List<AreaConhecimento> getByAreaConhecimentoIdGreaterThan(@PathVariable int num) {
		return this.repo.findByAreaConhecimentoIdGreaterThan(num);
	}
	
	@GetMapping("/AreaConhecimentos/between/{start}/{fim}")
	public List<AreaConhecimento> getByAreaConhecimentoIdBetween(int start, int fim){
		return this.repo.findByAreaConhecimentoIdBetween(start, fim);
	}
	
	
	@PostMapping("/areaConhecimento")
	public AreaConhecimento post(@RequestBody AreaConhecimento area) {
//		area.setareaConhecimentoId(repo.findByAreaConhecimentoIdMax() + 1);
		return this.repo.save(area);
	}
	
	@DeleteMapping(path = "/areaConhecimento/{areaId}")
	public void delete(@PathVariable int areaId) {
		if(this.repo.findById(areaId).orElse(null) != null)
			 this.repo.deleteById(areaId);
	}
	
	@PutMapping(path = "/areaConhecimento")
	public AreaConhecimento put(@RequestBody AreaConhecimento areaConhecimento) {
		return this.repo.findById(areaConhecimento.getareaConhecimentoId())
				.map(area -> {
					area.setareaConhecimentoId(area.getareaConhecimentoId());
					area.setDescricao(area.getDescricao());
					return this.repo.save(area);
				})
				.orElse(null);
	}
}
