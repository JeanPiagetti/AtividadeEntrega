package br.com.biblioteca.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity(name = "projeto")
public class ProjetoModel {
	@Id
	@GeneratedValue(generator = "increment")
	private Integer id;

	private String nomeProjeto;
	@Lob
	private String descricao;
	
	private Date dtInicio;

	private Date previsaoTermino;

	private float orcamentoTotal;

	private Date dataRealTermino;

	private String status;
	
	private String risco;

	private GerenteProjetoModel responsavel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getPrevisaoTermino() {
		return previsaoTermino;
	}

	public void setPrevisaoTermino(Date previsaoTermino) {
		this.previsaoTermino = previsaoTermino;
	}

	public float getOrcamentoTotal() {
		return orcamentoTotal;
	}

	public void setOrcamentoTotal(float orcamentoTotal) {
		this.orcamentoTotal = orcamentoTotal;
	}

	public Date getDataRealTermino() {
		return dataRealTermino;
	}

	public void setDataRealTermino(Date dataRealTermino) {
		this.dataRealTermino = dataRealTermino;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRisco() {
		return risco;
	}

	public void setRisco(String risco) {
		this.risco = risco;
	}

	public GerenteProjetoModel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(GerenteProjetoModel responsavel) {
		this.responsavel = responsavel;
	}
	
	
}
