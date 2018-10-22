package projeto.geral;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Turma implements Identificavel{

	@Id
	@GeneratedValue(generator="turma_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="turma_seq")
	private Long id;
	private Disciplina nome;
	private Professor docente;
	private ArrayList<Aluno> discentes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Disciplina getNome() {
		return nome;
	}

	public void setNome(Disciplina nome) {
		this.nome = nome;
	}

	public Professor getDocente() {
		return docente;
	}

	public void setDocente(Professor docente) {
		this.docente = docente;
	}

	public ArrayList<Aluno> getDiscentes() {
		return discentes;
	}

	public void setDiscentes(ArrayList<Aluno> discentes) {
		this.discentes = discentes;
	}
}
