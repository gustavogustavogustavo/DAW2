package projeto.geral;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Turma implements Identificavel {

	@Id
	@GeneratedValue(generator = "turma_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "turma_seq")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_professor")
	private Professor docente;
	private ArrayList<Aluno> discentes;
	
	@ManyToOne
	@JoinColumn(name = "id_disciplina")
	private Disciplina disciplina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<Aluno> getDiscentes() {
		return discentes;
	}

	public void setDiscentes(ArrayList<Aluno> discentes) {
		this.discentes = discentes;
	}
}
