package projeto.DAO;

import java.util.List;

import projeto.Filtro.AlunoFiltro;
import projeto.geral.Aluno;

public class AlunoDAO extends DAO<Aluno> {

	public AlunoDAO() {
		super(Aluno.class);
	}

	public List<Aluno> findBy(AlunoFiltro filtro) {
		return null;
	}

}
