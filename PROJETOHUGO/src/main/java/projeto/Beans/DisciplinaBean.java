package projeto.Beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;


import projeto.Services.DisciplinaService;
import projeto.geral.Disciplina;



public class DisciplinaBean implements Serializable{
	
	@Inject
	private DisciplinaService service;

	protected Disciplina entidade;

	protected Collection<Disciplina> entidades;

	public DisciplinaBean() {
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Disciplina entidade) {
		getService().remove(entidade);
		limpar();
	}

	public void setService(DisciplinaService service) {
		this.service = service;
	}

	public Disciplina getEntidade() {
		return entidade;
	}

	public void setEntidade(Disciplina entidade) {
		this.entidade = entidade;
	}

	public Collection<Disciplina> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Disciplina> entidades) {
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

	protected Disciplina newEntidade() {
		return new Disciplina();
	}

	public DisciplinaService getService() {
		return service;
	}
}




