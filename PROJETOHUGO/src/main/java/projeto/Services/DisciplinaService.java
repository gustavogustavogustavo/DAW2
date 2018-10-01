package projeto.Services;


	import java.io.Serializable;
	import java.util.List;
	import projeto.DAO.DisciplinaDAO;
	import projeto.Util.TransacionalCdi;
	import projeto.geral.Disciplina;


	public class DisciplinaService implements Serializable, Service<Disciplina>{
	
			private static final long serialVersionUID = -7803325791425670859L;
			private DisciplinaDAO disciplinaDAO;

			@Override
			@TransacionalCdi
			public void save(Disciplina e) {
				disciplinaDAO.save(e);
			}

			@Override
			@TransacionalCdi
			public void update(Disciplina e) {
				disciplinaDAO.update(e);
			}

			@Override
			@TransacionalCdi
			public void remove(Disciplina e) {
				disciplinaDAO.remove(e);
			}

			@Override
			public Disciplina getByID(long id) {
				return disciplinaDAO.getByID(id);
			}

			@Override
			public List<Disciplina> getAll() {
				return disciplinaDAO.getAll();
			}

		}
