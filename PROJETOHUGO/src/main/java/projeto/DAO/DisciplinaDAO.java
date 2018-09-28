package projeto.DAO;

import java.util.List;

import projeto.Filtro.DisciplinaFiltro;
import projeto.geral.Disciplina;

public class DisciplinaDAO extends DAO<Disciplina> {

	public DisciplinaDAO() {
		super(Disciplina.class);
	}

	public List<Disciplina> findBy(DisciplinaFiltro filtro) {
		return null;
	}

}
