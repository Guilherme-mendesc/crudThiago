package com.crud.lojas.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table
public class Lojas {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long id;
	
	@NotNull
	@Size(min=3, max = 100)
	private String nome;
	
	@NotNull
	@Size(min=3, max = 100)
	private String cnpj;
	
	@NotNull
	@Size(min=3, max=10)
	private String dataFundacao;
	
	@OneToMany(mappedBy ="lojas" , cascade = CascadeType.ALL)
	@JsonIgnoreProperties("lojas")
	private List<Produto> produtos;
	

	public Lojas() {}


	public Lojas(long id, @NotNull @Size(min = 3, max = 100) String nome,
			@NotNull @Size(min = 3, max = 100) String cnpj, @NotNull @Size(min = 3, max = 10) String dataFundacao,
			List<Produto> produtos) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.dataFundacao = dataFundacao;
		this.produtos = produtos;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getDataFundacao() {
		return dataFundacao;
	}


	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}


	@Override
	public String toString() {
		return "Lojas [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + ", dataFundacao=" + dataFundacao
				+ ", produtos=" + produtos + "]";
	}
	

	

	
	
	}
	
	

	
	
	
	
	
	


