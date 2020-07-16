package br.com.biblioteca.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public class MembroModel extends Pessoa {
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private long idProjeto;

	public MembroModel() {
		super();

	}

	public long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(long idProjeto) {
		this.idProjeto = idProjeto;
	}

}
