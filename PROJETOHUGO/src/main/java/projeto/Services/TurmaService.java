package projeto.Services;

import java.io.Serializable;
import java.util.List;
import projeto.DAO.TurmaDAO;
import projeto.Util.TransacionalCdi;
import projeto.geral.Turma;



public class TurmaService implements Serializable, Service<Turma>{

		private static final long serialVersionUID = -7803325791425670859L;
		private TurmaDAO turmaDAO;

		@Override
		@TransacionalCdi
		public void save(Turma e) {
			turmaDAO.save(e);
		}

		@Override
		@TransacionalCdi
		public void update(Turma e) {
			turmaDAO.update(e);
		}

		@Override
		@TransacionalCdi
		public void remove(Turma e) {
			turmaDAO.remove(e);
		}

		@Override
		public Turma getByID(long id) {
			return turmaDAO.getByID(id);
		}

		@Override
		public List<Turma> getAll() {
			return turmaDAO.getAll();
		}

	}

