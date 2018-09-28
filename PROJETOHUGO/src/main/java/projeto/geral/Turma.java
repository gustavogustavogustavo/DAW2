package projeto.geral;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Turma implements Identificavel{

	@Id
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
