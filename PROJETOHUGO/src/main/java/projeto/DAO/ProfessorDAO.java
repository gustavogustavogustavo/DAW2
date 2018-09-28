package projeto.DAO;

import java.util.List;

import projeto.Filtro.ProfessorFiltro;
import projeto.geral.Professor;

public class ProfessorDAO extends DAO<Professor> {

	public ProfessorDAO() {
		super(Professor.class);
	}

	public List<Professor> findBy(ProfessorFiltro filtro) {
		return null;
	}

}
