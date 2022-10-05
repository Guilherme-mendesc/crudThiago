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
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long id;
	
	@NotNull
	@Size(min=3, max = 100)
	private String lojas;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dataFundacao;
	
	@NotNull
	@Size(min=3, max = 100)
	private String cnpj;
	
	public Lojas() {}
	
	public Lojas(long id, String lojas, Date dataFundacao, String cnpj) {
		this.id = id;
		this.lojas = lojas;
		this.dataFundacao = dataFundacao;
		this.cnpj = cnpj;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLojas() {
		return lojas;
	}

	public void setLojas(String lojas) {
		this.lojas = lojas;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return getId()+
				getLojas()+
				sdf.format(dataFundacao)
				;
	}
	
	
	
	

}
