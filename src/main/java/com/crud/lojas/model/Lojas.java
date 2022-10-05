package com.crud.lojas.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
	@Temporal(TemporalType.DATE)
	private Date dataFundacao = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	@Size(min=3, max = 100)
	private String cnpj;
	
	public Lojas() {}

	public Lojas(long id, @NotNull @Size(min = 3, max = 100) String nome, @NotNull Date dataFundacao,
			@NotNull @Size(min = 3, max = 100) String cnpj) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataFundacao = dataFundacao;
		this.cnpj = cnpj;
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

	public Date getdataFundacao() {
		return dataFundacao;
	}

	public void setData(Date data) {
		this.dataFundacao = data;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Lojas [id=" + id + ", nome=" + nome + ", data=" + dataFundacao + ", cnpj=" + cnpj + "]";
	}

	
	
	
	
	
	

	}
	
	

	
	
	
	
	
	


