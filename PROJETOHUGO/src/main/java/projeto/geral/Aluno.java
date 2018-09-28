package projeto.geral;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno implements Identificavel{

	private Long matricula;
	@Id
	private Long id;
	private String nomeAluno;
	private Turma nomeDisciplina;

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Turma getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(Turma nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}


}
