package projeto.Beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import projeto.Services.TurmaService;
import projeto.geral.Turma;



public class TurmaBean implements Serializable {

	@Inject
	private TurmaService service;

	protected Turma entidade;

	protected Collection<Turma> entidades;

	public TurmaBean() {
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Turma entidade) {
		getService().remove(entidade);
		limpar();
	}
	public Turma getEntidade() {
		return entidade;
	}

	public void setEntidade(Turma entidade) {
		this.entidade = entidade;
	}

	public Collection<Turma> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Turma> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getService().getAll();
		entidade = newEntidade();
	}

	protected Turma newEntidade() {
		return new Turma();
	}

	public TurmaService getService() {
		return service;
	}

}


