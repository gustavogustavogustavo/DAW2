package projeto.Beans;

import java.io.IOException;
import java.io.Serializable;
import java.security.Principal;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import projeto.Services.ProfessorService;
import projeto.geral.Professor;

public class ProfessorBean implements Serializable {

	@Inject
	private ProfessorService service;

	protected Professor entidade;
	
	protected String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setService(ProfessorService service) {
		this.service = service;
	}

	protected Collection<Professor> entidades;

	public ProfessorBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}
	public String getProfessorLogin() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		Principal professorPrincipal = externalContext.getProfessorPrincipal();
		if (professorPrincipal == null) {
			return "";
		}
		return professorPrincipal.getName();
	}
	
	public void efetuarLogout() throws IOException, ServletException {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);
		session.invalidate();
		HttpServletRequest request = (HttpServletRequest) ec.getRequest();
		request.logout();
		ec.redirect(ec.getApplicationContextPath());
	}
	
	public boolean isProfessorInRole(String role) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		return externalContext.isProfessorInRole(role);
	}

	public void remove(Professor entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Professor getEntidade() {
		return entidade;
	}

	public void setEntidade(Professor entidade) {
		this.entidade = entidade;
	}

	public Collection<Professor> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Professor> entidades) {
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

	protected Professor newEntidade() {
		return new Professor();
	}

	public ProfessorService getService() {
		return service;
	}

}
