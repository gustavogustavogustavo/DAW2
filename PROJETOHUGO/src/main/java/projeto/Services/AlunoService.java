package projeto.Services;

import java.io.Serializable;
import java.util.List;
import projeto.DAO.AlunoDAO;
import projeto.Util.TransacionalCdi;
import projeto.geral.Aluno;



public class AlunoService implements Serializable, Service<Aluno>{

		private static final long serialVersionUID = -7803325791425670859L;
		private AlunoDAO alunoDAO;

		@Override
		@TransacionalCdi
		public void save(Aluno e) {
			alunoDAO.save(e);
		}

		@Override
		@TransacionalCdi
		public void update(Aluno e) {
			alunoDAO.update(e);
		}

		@Override
		@TransacionalCdi
		public void remove(Aluno e) {
			alunoDAO.remove(e);
		}

		@Override
		public Aluno getByID(long id) {
			return alunoDAO.getByID(id);
		}

		@Override
		public List<Aluno> getAll() {
			return alunoDAO.getAll();
		}

	}

