package projeto.geral;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Disciplina implements Identificavel {

	@Id
	@GeneratedValue(generator="disciplina_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="disciplina_seq")
	private Long id;
	private String nome;
	private String desc;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
