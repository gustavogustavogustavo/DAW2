package projeto.geral;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor implements Identificavel{

	@Id
	private Long id;
	private String nome;
	private ArrayList<Turma> responsavel;
	private Disciplina formacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Turma> getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(ArrayList<Turma> responsavel) {
		this.responsavel = responsavel;
	}

	public Disciplina getFormacao() {
		return formacao;
	}

	public void setFormacao(Disciplina formacao) {
		this.formacao = formacao;
	}

}
