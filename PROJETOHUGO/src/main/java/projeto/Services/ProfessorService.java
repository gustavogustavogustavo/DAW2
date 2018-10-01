package projeto.Services;

import java.io.Serializable;
import java.util.List;

import projeto.DAO.ProfessorDAO;
import projeto.Util.TransacionalCdi;
import projeto.geral.Professor;

public class ProfessorService implements Serializable, Service<Professor> {
		
		private static final long serialVersionUID = -7803325791425670859L;
		private ProfessorDAO professorDAO;

		@Override
		@TransacionalCdi
		public void save(Professor e) {
			professorDAO.save(e);
		}

		@Override
		@TransacionalCdi
		public void update(Professor e) {
			professorDAO.update(e);
		}

		@Override
		@TransacionalCdi
		public void remove(Professor e) {
			professorDAO.remove(e);
		}

		@Override
		public Professor getByID(long id) {
			return professorDAO.getByID(id);
		}

		@Override
		public List<Professor> getAll() {
			return professorDAO.getAll();
		}

	}


