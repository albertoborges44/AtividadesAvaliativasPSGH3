package servico;

import java.util.List;

import ancestral.*;
import dominio.*;
import repositorio.*;

public class ProdutoServico 
extends BaseGenericService<ProdutoRepositorio> 
implements IGenericService<Produto> {

	public ProdutoServico(String nomeUnidade) {
		super(nomeUnidade);
		this.repositorio= new ProdutoRepositorio(this.nomeUnidade);
	}

	@Override
	public void inserir(Produto instance) {
		this.repositorio.create(instance);
		
	}

	@Override
	public void alterar(Produto instance) {
		this.repositorio.update(instance);
		
	}

	@Override
	public void excluir(Produto instance) {
		this.repositorio.delete(instance);
		
	}

	@Override
	public void excluirPorId(int id) {
		this.repositorio.read(id);
		
	}

	@Override
	public List<Produto> listar() {
		return this.repositorio.readAll();
	}

	@Override
	public Produto obter(int id) {
		this.repositorio.read(id);
		return null;
	}

	@Override
	public void dispose() {
		this.repositorio.dispose();
		
	}

}
