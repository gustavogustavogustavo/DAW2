package projeto.geral;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disciplina implements Identificavel {

	@Id
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
