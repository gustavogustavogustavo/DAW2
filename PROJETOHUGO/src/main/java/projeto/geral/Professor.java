package projeto.geral;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Professor implements Identificavel{

	@Id
	@GeneratedValue(generator="professor_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="professor_seq")
	private Long id;
	private String username;
	private String password;
	private String grupo;
	
	@OneToOne
	private Disciplina formacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return username;
	}

	public void setNome(String username) {
		this.username = username;
	}

	
	public Disciplina getFormacao() {
		return formacao;
	}

	public void setFormacao(Disciplina formacao) {
		this.formacao = formacao;
	}

}
