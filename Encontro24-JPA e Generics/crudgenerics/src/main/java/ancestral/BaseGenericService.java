package ancestral;

public abstract class BaseGenericService<R> {

	protected String nomeUnidade;
	
	protected R repositorio;
	
	public R getRepositorio() {
		return this.repositorio;
	}
	
	public String getnomeUnidade() {
		return nomeUnidade;
	}

	public BaseGenericService(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}
	
	

}
