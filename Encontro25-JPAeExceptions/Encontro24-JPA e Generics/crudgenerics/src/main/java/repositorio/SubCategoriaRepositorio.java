package repositorio;

import java.util.List;

import javax.persistence.Query;

import ancestral.BaseGenericRepository;
import ancestral.IGenericRepository;
import dominio.*;

public class SubCategoriaRepositorio 
extends BaseGenericRepository<SubCategoria>
implements IGenericRepository<SubCategoria> {

	public SubCategoriaRepositorio(String nomeUnidade) {
		super(nomeUnidade);
		
	}

	@Override
	public void create(SubCategoria instance) {
		this.getSession().getTransaction().begin();
		this.getSession().persist(instance);
		this.getSession().getTransaction().commit();
		
	}

	@Override
	public List<SubCategoria> readAll() {
		Query qry = this.getSession().createQuery("FROM SubCategoria");
		@SuppressWarnings("unchecked")
		List<SubCategoria> lista = qry.getResultList();
		return lista;
	}

	@Override
	public SubCategoria read(int id) {
		SubCategoria sub = this.getSession().find(SubCategoria.class, id);
		
		return sub;
	}

	@Override
	public SubCategoria update(SubCategoria instance) {
		SubCategoria sub = this.getSession().find(SubCategoria.class, instance.getSubCategoriaId());
		this.getSession().detach(sub);
		this.getSession().getTransaction().begin();
		SubCategoria mergeSubCategoria = (SubCategoria)this.getSession().merge(instance);
		this.getSession().merge(instance);
		this.getSession().getTransaction().commit();
		return mergeSubCategoria;
		
	}

	@Override
	public void delete(int id) {
		SubCategoria sub = this.getSession().find(SubCategoria.class, id);
		this.getSession().getTransaction().begin();
		this.getSession().remove(sub);
		this.getSession().getTransaction().commit();
	}

	@Override
	public void delete(SubCategoria instance) {
		SubCategoria sub = this.getSession().find(SubCategoria.class, instance.getSubCategoriaId());
		this.getSession().getTransaction().begin();
		this.getSession().remove(sub);
		this.getSession().getTransaction().commit();
	}

}
