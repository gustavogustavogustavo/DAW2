package projeto.DAO;

import java.util.List;

import projeto.Filtro.TurmaFiltro;
import projeto.geral.Turma;

public class TurmaDAO extends DAO<Turma> {

	public TurmaDAO() {
		super(Turma.class);
	}

	public List<Turma> findBy(TurmaFiltro filtro) {
		return null;
	}

}
